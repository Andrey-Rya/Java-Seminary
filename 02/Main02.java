import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class Main02 {
    private static Logger logger = Logger.getLogger(Main02.class.getName());

    public static void main(String[] args) throws IOException {
        FileHandler rw = new FileHandler("logger.txt");
        logger.addHandler(rw);
        SimpleFormatter sF = new SimpleFormatter();
        rw.setFormatter(sF);

        System.out.print("Введите количество чисел в вашем массиве: ");
        Scanner in = new Scanner(System.in, "Cp866");
        int n = in.nextInt();
        in.close();

        int[] array = unsortedArray(n);
        System.out.print("Ваш неотсортированный массив из случайных чисел (от 10 до 99):  ");
        printArr(array);
        System.out.print("\n");

        array = sortArray(array);
        System.out.print("Массив из случайных чисел после сортировки по возростанию:  ");
        printArr(array);

    }

    // заполнение массива рандомными числами от 10 до 99
    public static int checkRandom() {
        Random random = new Random();
        int a = 11;
        int b = 100;
        int difference = b - a;
        int num = random.nextInt(difference + 1) + a;
        return num;

    }

    public static int[] unsortedArray(int n) {

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = checkRandom();
        }
        return array;
    }

    public static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // сортируем массив
    public static int[] sortArray(int[] array) throws IOException {
        System.out.println("Ниже результаты после проведенных итераций:  ");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            logger.info("Проведена итерация №" + (array.length - i));
        }
        return array;
    }
}
