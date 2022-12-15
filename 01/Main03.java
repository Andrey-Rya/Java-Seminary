
/*
3. Реализовать простой калькулятор.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // получение ввода от пользователя с помощью сканера клавиатуры

        System.out.print(
                "Введите первое и второе число (через пробел):  ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // выбор операнда для вычислений
        System.out.print(
                "Выберите тип операции, которую вы хотите выполнить (+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        solve(a, b, op);
    }

    public static int solve(int a, int b, char op) {
        int ans = 0;
        // суммирование
        if (op == '+') {
            ans = a + b;
            // вычитание
        } else if (op == '-') {
            ans = a - b;
            // умножение
        } else if (op == '*') {
            ans = a * b;
            // модуль
        } else if (op == '%') {
            ans = a % b;
            // деление
        } else if (op == '/') {
            ans = a / b;
        }

        // Вывод значения
        System.out.println("Ваш ответ: = " + ans);
        return ans;
    }
}


/*
Второй вариант простого калькулятора
*/

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Введите два числа через пробел");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print(
                "Какую математическую операцию вы хотите произвести: \n сложение - sum \n" +
                        " вычитание - minus \n умножение - mult \n деление - div \n Введите: ");

        String operation = sc.next();
        sc.close();

        double res = 0;

        if (operation.equals("sum")) {
            res = x + y;
            System.out.println(res);
        } else if (operation.equals("minus")) {
            res = x - y;
        } else if (operation.equals("mult")) {
            res = x * y;
        } else if (operation.equals("div")) {
            res = x / y;
        }

        System.out.println(operation);

        System.out.println(res);
    }

}
