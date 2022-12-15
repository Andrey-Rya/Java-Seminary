import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class Main04 {
    private static Logger logger = Logger.getLogger(Main04.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler rw = new FileHandler("logger.txt");
        logger.addHandler(rw);
        SimpleFormatter sFormat = new SimpleFormatter();
        rw.setFormatter(sFormat);

        Solve solve = new Solve();
        double answer = solve.solutions();
        solve.examination();
        System.out.println(" Ваш ответ: " +answer);

    }
}

class Solve {
    private static Logger logger = Logger.getLogger(Main04.class.getName());

    String operation;
    double res;
    double x;
    double y;
    boolean test = false;

    Solve() {
        //Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое и второе число (через пробел): ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        System.out.print("\n");
        logger.info("Введены два числа.");
        System.out.println("Выберите требуемое математическое действие: ");

        System.out.print(
                " сложение => + \n"+
                " вычитание => - \n"+
                " умножение => / \n"+
                " деление => * \n"+
                "Ваше решение: ");
        operation = sc.next();
        sc.close();
    }

    double solutions() {
        //System.out.print("\n");
        if (operation.equals("+")) {
            //System.out.print("\n");
            res = x + y;
            //System.out.print("\n");
            test = true;
            logger.info("Произведено действие - сложение");
        } else if (operation.equals("-")) {
            res = x - y;
            test = true;
            logger.info("Произведено действие - вычитание");
        } else if (operation.equals("*")) {
            res = x * y;
            test = true;
            logger.info("Произведено действие - умножение");
        } else if (operation.equals("/")) {
            res = x / y;
            test = true;
            logger.info("Произведено действие - деление");
        }
        return res;

    }

    void examination() {
        System.out.print("\n");
        if (test) {
            logger.info("Вычисление произведено успешно");

        } else {
            System.out.println("Вы ввели неправильную операцию");
            logger.log(Level.WARNING, "Пользователь сделал ошибку ввода");
        }
    }
}
