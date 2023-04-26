package homework4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class ConsoleApp1 {
    public static void main(String[] args) {
        task01();
    }

    private static void task01() {
        Scanner scanInput = new Scanner(System.in);
        LinkedList<String> inputList = new LinkedList<>();
        Collections.addAll(inputList, "Moscow", "Soligork", "Odintcovo", "Novosibirsk", "Krasnoyarsk", "Vitebsk");


        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = scanInput.nextLine();

            if (inputString.trim().length() == 0) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }

            if (inputString.equalsIgnoreCase("stop")) {
                break;
            }

            if (inputString.equalsIgnoreCase("print")) {
                changeElemPosition(inputList);
                continue;
            }

            if (inputString.equalsIgnoreCase("print all")) {
                printAllNotNullValues(inputList);
                continue;
            }

            if (inputString.equalsIgnoreCase("revert")) {
                deleteTheLastInput(inputList);
                continue;
            }


            if (!inputString.contains("-")) {
                System.out.println("Строка должна содержать '-' для определения порядкового номера в списке ");
                continue;
            }

            String[] cityInput = inputString.split("\\-+");

            if (cityInput.length != 2) {
                System.out.println("Ошибка ввода. Должно быть \"word-num\". Пример: Moscow-1");
                continue;
            }

            String word = cityInput[0];
            int num = 0;

            try {
                num = Integer.parseInt(cityInput[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }
            if (num < 1) {
                System.out.println("Введите num более 1");
                continue;
            }

            if (word.equalsIgnoreCase("city")) {
                if (!isNumberInRange(num, inputList.size()) || valueIsNull(inputList, num)) {
                    System.out.println("Указанного значения не существует");
                } else {
                    System.out.printf("Под номером %d находится слово: %s%n", num, inputList.get(num - 1));
                    inputList.remove(num - 1);
                }
            } else if (isNumberInRange(num, inputList.size())) {
                String oldWord = inputList.get(num - 1);

                if (valueIsNull(inputList, num)) {
                    printAddMessage(word, num);
                } else {
                    printSetMessage(word, oldWord, num);
                }
                inputList.set(num - 1, word);
            } else {
                int nullCount = num - inputList.size() - 1;
                addNulls(inputList, nullCount);
                inputList.add(word);
                printAddMessage(word, num);
            }
        }


    }

    private static void changeElemPosition(LinkedList<String> inputList) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(inputList);
        inputList.clear();
        while (!arrayDeque.isEmpty()) {
            inputList.add(arrayDeque.pollLast());
        }
        printAllNotNullValues(inputList);
    }


    private static void printAllNotNullValues(LinkedList<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) != null) {
                System.out.printf("%d. %s%n", i + 1, inputList.get(i));
            }
        }
    }

    private static void deleteTheLastInput(LinkedList<String> inputList) {
        if (!inputList.isEmpty()) {
            inputList.removeLast();
            System.out.printf("Последнее название города удалено");
        }
    }


    private static boolean isNumberInRange(int num, int size) {
        return num >= 1 & num <= size;
    }

    private static boolean valueIsNull(LinkedList<String> inputList, int num) {
        return inputList.get(num - 1) == null;
    }

    private static void printAddMessage(String word, int num) {
        System.out.printf("Город %s добавлен на позицию %d%n", word, num);
    }

    private static void printSetMessage(String word, String oldWord, int num) {
        System.out.printf("Введенное название город %s заменило город %d на позиции %s%n", word, oldWord, num);
    }

    private static void addNulls(LinkedList<String> inputList, int count) {
        for (int i = 0; i < count; i++) {
            inputList.add(null);
        }
    }
}


