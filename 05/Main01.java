import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main01 {

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов"); // ищем по фамилии Иванов
        findInPhoneBook("Васильев"); // ищем по фамилии Васильев
        findInPhoneBook("+7(111)111-11-11"); // ищем по номеру телефона
        //findInPhoneBook("Васильев");
    }

    public static void addInPhoneBook () {

        // добавляем к одному человеку несколько телефонов
        //phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        //phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        //phoneBook.put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        phoneBook.put("Иванов", Collections.singletonList("+7(555)555-55-55, +7(444)444-44-44"));
        phoneBook.put("Васильев", Collections.singletonList("+7(777)777-77-77, +7(666)666-66-66"));
        phoneBook.put("Сидоров", Collections.singletonList("+7(999)999-99-99, +7(888)888-88-88"));
        System.out.println("Телефонный справочник: ");
        System.out.print(phoneBook + "\n");
    }

    public static void findInPhoneBook(String surname) {
        System.out.println();
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
