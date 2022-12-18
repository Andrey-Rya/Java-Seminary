import java.io.Serializable;
import java.util.*;

class Notebook implements Serializable {
    private String name;
    private int RAM;
    private int hardDiskSize;
    private String operatingSysthem;
    private int price;

    private int filter;
    private Object getoperatingSysthem;

    public Notebook(String name, int RAM, int hardDiskSize, String operatingSysthem, int price) {
        this.name = name;
        this.RAM = RAM;
        this.hardDiskSize = hardDiskSize;
        this.operatingSysthem = operatingSysthem;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public String getoperatingSysthem() {
        return operatingSysthem;
    }

    public int getPrice() {
        return price;
    }

    public int getFilterValue(){
        return filter;
    }

    public void setFilter(String criterial){
        switch (criterial){
            case "1":
                filter = RAM;
                break;
            case "2":
                filter = hardDiskSize;
                break;
            case "3":
                filter = Integer.valueOf((String)operatingSysthem);
                break;
            case "4":
                filter = price;
                break;
        }
    }

    public static final Comparator<Notebook> COMPARE_BY_PRICE = new Comparator<Notebook>() {
        @Override
        public int compare(Notebook lhs, Notebook rhs) {
            lhs.filter = lhs.price;
            rhs.filter = rhs.price;
            return lhs.getPrice() - rhs.getPrice();
        }
    };

    public static final Comparator<Notebook> COMPARE_BY_RAM = new Comparator<Notebook>() {
        @Override
        public int compare(Notebook lhs, Notebook rhs) {
            lhs.filter = lhs.RAM;
            rhs.filter = rhs.RAM;
            return lhs.getRAM() - rhs.getRAM();
        }
    };

    public static final Comparator<Notebook> COMPARE_BY_HARDDISKSIZE = new Comparator<Notebook>() {
        @Override
        public int compare(Notebook lhs, Notebook rhs) {
            lhs.filter = lhs.hardDiskSize;
            rhs.filter = rhs.hardDiskSize;
            return lhs.getHardDiskSize() - rhs.getHardDiskSize();
        }
    };

    public static final Comparator<Notebook> COMPARE_BY_SCREENDIAGONAL = new Comparator<Notebook>() {
        @Override
        public int compare(Notebook lhs, Notebook rhs) {
            lhs.filter = Integer.valueOf(lhs.operatingSysthem);
            rhs.filter = Integer.valueOf(rhs.operatingSysthem);
            return Integer.valueOf((String) lhs.getoperatingSysthem) - Integer.valueOf((String) rhs.getoperatingSysthem);


        }
    };
}

class Manager
{
    public HashMap<Integer, String> getCritertions() {
        return critertions;
    }

    private HashMap<Integer, String> critertions = new HashMap<Integer, String>();
    public Manager()
    {
        critertions.put(1, "ОЗУ");
        critertions.put(2, "Объем жесткого диска (ЖД)");
        critertions.put(3, "Операционная система ");
        critertions.put(4, "Цена(руб)");
    }

    public void filterByCriterion(ArrayList<Notebook> notebooks, String criterion) {
        for (Notebook notebook : notebooks) {
            notebook.setFilter(criterion);
        }

        switch (criterion){
            case "1":
                System.out.println("Название | ОЗУ(Гб)\n---------|--------");
                break;
            case "2":
                System.out.println("Название | Обьем ЖД (Гб)\n---------|--------");
                break;
            case "3":
                System.out.println("Название | Операционная система\n---------|-------");
                break;
            case "4":
                System.out.println("Название | Цена(руб)\n---------|--------");
                break;
        }

        for (Notebook notebook : notebooks)
        {
            System.out.println(notebook.getName() + "\t | " + notebook.getFilterValue());
        }

    }

    public void sortFilter(ArrayList<Notebook> notebooks, int criterion) {
        switch (criterion){
            case 1:
                Collections.sort(notebooks, Notebook.COMPARE_BY_RAM);
                System.out.println("Название | ОЗУ(Гб)\n---------|--------");
                break;
            case 2:
                Collections.sort(notebooks, Notebook.COMPARE_BY_HARDDISKSIZE);
                System.out.println("Название | Обьем ЖД (Гб)\n---------|--------");
                break;
            case 3:
                Collections.sort(notebooks, Notebook.COMPARE_BY_SCREENDIAGONAL);
                System.out.println("Название | Операционная система\n---------|--------");
                break;
            case 4:
                Collections.sort(notebooks, Notebook.COMPARE_BY_PRICE);
                System.out.println("Название | Цена(руб)\n---------|--------");
                break;
        }

        for (Notebook notebook : notebooks)
        {
            System.out.println(notebook.getName() + "\t | " + notebook.getFilterValue());
        }
    }
}



public class Main {
    public static void main(String[] args) {

        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();

        Notebook Asus = new Notebook("Asus", 16, 256, "Windows 10",59000);
        Notebook HP = new Notebook("HP  ", 16, 512, "Ubuntu",75000);
        Notebook MacBook = new Notebook("MacBook", 32, 256, "macOS", 54000);
        Notebook Lenovo = new Notebook("Lenovo", 8, 512, "Linux",65000);

        notebooks.add(Asus);
        notebooks.add(HP);
        notebooks.add(MacBook);
        notebooks.add(Lenovo);

        System.out.print("Введите цифру, соответствующую необходимому критерию: \n");
        Manager manager = new Manager();

        for (Map.Entry entry : manager.getCritertions().entrySet()) {
            System.out.println(entry.getKey() + " - "
                    + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        int criterion = scanner.nextInt();

        System.out.println("\nПодходящие ноутбуки по фильтру " + criterion + ":");
        manager.filterByCriterion(notebooks, String.valueOf(criterion));
        System.out.println("\nПодходящие ноутбуки по фильтру " + criterion + " c сортировкой:");
        manager.sortFilter(notebooks, criterion);
    }
}
