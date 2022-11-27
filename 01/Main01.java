
/*
1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
   1.1  n! (произведение чисел от 1 до n)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите n-ное треугольное число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print("Сумма равняется: ");
        for (int i = 1; i <= n; i++) {
            if (i != n)
                System.out.print(i + "+");
            else {
                System.out.print(i + "=");
            }
        }
        System.out.print(n * (n + 1) / 2);

        System.out.println();
        System.out.print("Факториал числа равняется: ");
        for (int i = 1; i <= n; i++) {
            if (i != n)
                System.out.print(i + "x");
            else
                System.out.print(i + "=");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
