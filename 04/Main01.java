import java.util.*;

public class Main01 {
    
//    public static void main(String[] args)
//    {
//        // Используем дополнительное пространство
//        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.add("Луна");
//        linkedList.add("Марс");
//        linkedList.add("Юпитер");
//        linkedList.add("Сатурн");
//        linkedList.add("Нептун");
//        linkedList.add("Земля");
//        System.out.print("Начальный список планет: " + linkedList);
//        linkedList = reverseLinkedList(linkedList);
//        System.out.print("\nПеревернутый список планет: " + linkedList);
//    }
//    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
//    {
//        LinkedList<String> revLinkedList = new LinkedList<String>();
//        for (int i = llist.size() - 1; i >= 0; i--) {
//            revLinkedList.add(llist.get(i));
//        }
//        return revLinkedList;
//    }
//}

// ============================================================================//

// Второй вариант решения этой задачи (используем класс Collection)

        public static void main(String[] args)
        {
            // Обьявляем список без определения его размера
            LinkedList<Integer> linkedlist = new LinkedList<Integer>();

            // Добавляем элементы в конец списка
            linkedlist.add(new Integer(11));
            linkedlist.add(new Integer(22));
            linkedlist.add(new Integer(33));
            linkedlist.add(new Integer(44));
            linkedlist.add(new Integer(55));
            System.out.print("Начальный список всех элементов: " + linkedlist +"\n");

            // Метод Collections.reverse принимает список как параметр и
            // возвращает его в обратном порядке
            Collections.reverse(linkedlist);

            System.out.print("Перевернутый список элементов:   " + linkedlist);
        }
}
