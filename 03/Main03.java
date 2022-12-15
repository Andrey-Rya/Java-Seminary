import java.util.ArrayList;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main03 {
    public static void main(String[] args) {
        ArrayList<Integer> listNew = new ArrayList<Integer>();
        for (int i = 0; i < 12; i++) {
            Random random = new Random(); // генератор случ чисел (от -100 дл 100)
            int val = (int)(Math.random()*(200 + 1)) - 100; // значение (от 0 до 1) * на 200 и из него - 100
            listNew.add(val);
        }
        System.out.printf("Список из 12-ти случайных целых чисел от (-100 до 100): %s\n", listNew);
        int max = max(listNew);
        int min = min(listNew);
        int maxItem = listNew.get(0);
        int minItem = listNew.get(0);
        int sumItems = 0;
        for (int item : listNew) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/listNew.size();

        System.out.printf("= = = = = = = = = = = = = = = = = = = = = = = = \n");
        System.out.printf("Максимальный элемент = %s\n", max);
        System.out.printf("Минимальный элемент = %s\n", min);
        System.out.printf("Сумма элементов = %s\n", sumItems);
        System.out.printf("Среднее арифметическое = %s\n", average);
        System.out.printf("Длина массива = %s\n", listNew.size());
    }
}
