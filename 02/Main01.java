import org.jetbrains.annotations.NotNull;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) throws IOException {
        int count = Stringes();
        System.out.print("В вашем файле (logger.txt) находится " + count +" строк(и). " );
        System.out.println("\n");
        //System.out.println(count + "\n");

        System.out.println("В файле (logger.txt) находится следующая информация: ");
        String[] arrayLines = ReadWrite(count);
        System.out.println();

        System.out.println("Лог WARNING: ");
        CheckInfo(arrayLines);

    }

    static int Stringes() throws IOException {
        FileReader inFile = new FileReader("logger.txt");
        Scanner file = new Scanner(inFile);

        int count = 0;
        while (file.hasNextLine()) {
            file.nextLine();
            count = count + 1;
        }
        file.close();
        return count;
    }

    static String @NotNull [] ReadWrite(int count) throws IOException {
        FileReader inFile = new FileReader("logger.txt");
        Scanner file = new Scanner(inFile);

        String[] arrayLines = new String[count];
        int s = 0;

        while (file.hasNextLine()) {
            String temp = file.nextLine();
            arrayLines[s] = temp;
            System.out.println(arrayLines[s]);
            s++;
        }
        file.close();
        return arrayLines;
    }

    static void CheckInfo(String @NotNull [] array) {
        for (int i = 1; i < array.length; i++) {
            String temp = array[i];
            if (temp.contains("WARNING")) {
                System.out.println(array[i - 1]);
                System.out.println(array[i]);
            }
        }
    }
}
