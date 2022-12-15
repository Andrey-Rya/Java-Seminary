import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {
        int[] array1 = { -53, 23, 69, 40, 0, 74, -33, -25, -7, -45, 16, -81, 43 }; // массив, который нужно отсортировать
        System.out.println("Дан неотсортированный массив: \n" + Arrays.toString(array1) + "\n");
        System.out.println("Отсортированный массив методом слияния: ");
        int[] sortArray1 = arraySorting(array1);
        System.out.println(Arrays.toString(sortArray1));
    }
    public static int[] arraySorting(int[] array1) {
        int[] tempOne = Arrays.copyOf(array1, array1.length);
        int[] tempTwo = new int[array1.length];
        int[] res = bruteForceSort(tempOne, tempTwo, 0, array1.length);
        return res;
    }

    public static int[] bruteForceSort(
            int[] tempOne, int[] tempTwo, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return tempOne;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = bruteForceSort(tempOne, tempTwo, startIndex, middle);
        int[] sorted2 = bruteForceSort(tempOne, tempTwo, middle, endIndex);
        int realIndex = startIndex;
        int index1 = startIndex;
        int index2 = middle;
        int[] result = sorted1 == tempOne? tempTwo : tempOne;
        while (index1 < middle && index2 < endIndex) {
            result[realIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[realIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[realIndex++] = sorted2[index2++];
        }
        return result;
    }
}
