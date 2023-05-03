package homework5;

import java.util.*;
import java.util.stream.Collectors;


public class EmployersList {
    public static void main(String[] args) {

        HashMap<String, String> employerMap = new HashMap<>();
        HashMap<String, Integer> countByNameMap = new HashMap<String, Integer>();

        employerMap.put("Иванов", "Иван");
        employerMap.put("Петрова", "Светлана");
        employerMap.put("Белова", "Кристина");
        employerMap.put("Мусина", "Анна");
        employerMap.put("Крутова", "Анна");
        employerMap.put("Юрин", "Иван");
        employerMap.put("Лыков", "Петр");
        employerMap.put("Чернов", "Павел");
        employerMap.put("Чернышов", "Петр");
        employerMap.put("Федорова", "Мария");
        employerMap.put("Светлова", "Марина");
        employerMap.put("Савина", "Мария");
        employerMap.put("Рыкова", "Мария");
        employerMap.put("Лугова", "Марина");
        employerMap.put("Владимирова", "Анна");
        employerMap.put("Мечников", "Иван");
        employerMap.put("Петин", "Петр");
        employerMap.put("Ежов", "Иван");


        for (String name : employerMap.values()) {
            if (!countByNameMap.containsKey(name)) {
                if (Collections.frequency(employerMap.values(), name) > 1) {
                    countByNameMap.put(name, Collections.frequency(employerMap.values(), name));
                }
            }
        }
       // System.out.println(countMap);
        countByNameMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}


