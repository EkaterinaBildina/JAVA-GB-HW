package lesson3;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        //task01();
        //task03();
        task04();
    }

    private static void task01() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        //Collections.sort(list, Comparator.naturalOrder());

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

    private static StringBuilder task03() {
        // Заполнить список названиями планет Солнечной системы в
        // произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество его
        // повторений в списке.

        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        Random random = new Random();
        List<String> randomSunSystem = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomSunSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }

        randomSunSystem.sort(Comparator.naturalOrder());

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            count = 0;
            for (var item :
                    randomSunSystem) {

                if (item.equals(planetsNamesStringArray[i])) {
                    count++;
                }

            }
            sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
            //System.out.println(randomSunSystem);
        }
        System.out.println(sb);
        return sb;
    }

    private static void task04() {
        // Пройти по списку из предыдущего задания и
        // удалить повторяющиеся элементы.
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        Random random = new Random();
        List<String> randomSunSystem = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomSunSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }

        randomSunSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSunSystem);


        for (int i = 0; i < randomSunSystem.size(); i++) {
            Set<String> setSSList = new LinkedHashSet<>(randomSunSystem);
            randomSunSystem.clear();
            randomSunSystem.addAll(setSSList);
        }
        System.out.println(randomSunSystem);

        // 2nd Method with distinct() application:
        //List<String> listWithoutDuplicates =
        //        randomSunSystem.stream().distinct().collect(Collectors.toList());
        //System.out.println(randomSunSystem);
    }


}











