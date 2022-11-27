
/*
2. Вывести все простые числа от 1 до 1000. (простые числа больше 1 и делятся без
    остатка на себя)
*/

public class Main {
    public static void main(String[] args) {
        int i, j;
        boolean check;

        for (i = 2; i < 1000; i++) {
            check = true;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    // проверка на простое число или нет (falce)
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
