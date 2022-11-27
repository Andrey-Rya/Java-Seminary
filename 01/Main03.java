
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
