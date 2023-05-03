package lesson5;

import java.util.HashMap;
import java.util.Map;

public class task27042023 {
    public static void main(String[] args) {

        //taskMap();
        String romeInt = "MMCMXCIX";
        System.out.println(rimNumValid(romeInt));
    }

    private static void taskMap() {
        Map<String, String> employeeMap = new HashMap<>(20);
        employeeMap.put("1234", "Иванов");
        employeeMap.put("1434", "Петров");
        employeeMap.put("3434", "Романцев");

        //1
        //for (Map.Entry<String, String> :employeeMap.entrySet()){
        //    System.out.printf("%s\t->\t%s%n", entry.getKey(), entry.getValue());

        //}

        //2
        //for (String key : employeeMap.keySet()) {
        //    System.out.printf("%s\t->\t%s%n", key, employeeMap.get(key));
        //}

        employeeMap.forEach((key, value) -> {
            System.out.printf("%s\t->\t%s%n", key, value);
        });


    }


    private static int rimNumValid(String str) {
        Map<Character, Integer> rimNumMap = new HashMap<>(20);
        rimNumMap.put('I', 1);
        rimNumMap.put('V', 5);
        rimNumMap.put('X', 10);
        rimNumMap.put('L', 50);
        rimNumMap.put('C', 100);
        rimNumMap.put('D', 500);
        rimNumMap.put('M', 1000);

        int prev = 0;
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int currentValue = rimNumMap.get(str.charAt(i));
            if (currentValue < prev) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prev = currentValue;
        }

        return result;
    }

}
