import java.util.ArrayList;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 12; i++) {
            Random random = new Random(); // генератор случ чисел (от -100 дл 100)
            int val = (int)(Math.random()*(200 + 1)) - 100; // значение (от 0 до 1) * на 200 и из него - 100.
            list1.add(val);
        }
        System.out.printf("Список из 12-ти случайных целых чисел от (-100 до 100): \n" + list1 + "\n");
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println("\n" + "Исходный список без четных чисел: \n" + list1);
    }
}
