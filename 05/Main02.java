import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Ургант " +
                "Светлана Светличная " +
                "Кристина Орбакайте " +
                "Андрей Ненашев " +
                "Сергей Арбеков " +
                "Иван Дураков " +
                "Иван Буров " +
                "Сергей Задорожный " +
                "Петр Чернышов " +
                "Елена Шукшина " +
                "Елена Александрова " +
                "Андрей Мерзликин " +
                "Елена Рожкова " +
                "Андрей Рязанцев " +
                "Анна Владимирова " +
                "Андрей Путин " +
                "Елена Иванова " +
                "Андрей Ургант";
        String[] namesAndSurnames = employees.split(" ");
        for (int i = 0; i < namesAndSurnames.length; i += 2) {
            if (nameMap.containsKey(namesAndSurnames[i])) {
                nameMap.replace(namesAndSurnames[i], nameMap.get(namesAndSurnames[i]) + 1);
            } else {
                nameMap.put(namesAndSurnames[i], 1);
            }
        }
        System.out.println("Список имён с указанием количества повторов: \n" + nameMap + "\n");
        Map<String, Integer> descendingSort = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    descendingSort.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println("Список имён сотрудников по убыванию повторов: \n" + descendingSort);
    }
}
