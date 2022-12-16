import java.util.LinkedList;

public class Main02 {

    public static void main(String[] args) {

        int[] list = { 0, 1, 2, 3, 4, 5, 6, 7 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer num : list) {
            linkList.add(num);
        }

        System.out.println("1. Это наш первоначальный список: " + linkList);

        enqueue(linkList, 10);
        System.out.println("2. Поместили элемент <10> в конец списка: " + linkList);

        System.out.println("3. Возвратили первый элемент из очереди: " + dequeue(linkList));
        System.out.println("4. Удалили первый элемент и вывели новый список: " + linkList);

        System.out.println("5. Возвратили новый первый элемент без удаления: " + first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
