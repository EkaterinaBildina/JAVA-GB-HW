package homework;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Date;
import java.util.Calendar;


public class HomeWork20230413 {
    public static void main(String[] args) {
        // task1run();
        // task2run();
        // task3run();
        task4run();
    }


    public static int[] task1run() {
        //1. Написать метод, принимающий на вход два аргумента:
        // len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;

        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int len = input.nextInt();

        int[] arr_output = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Элемент массива: ");
            int initialValue = input.nextInt();
            arr_output[i] = initialValue;

        }
        System.out.println(Arrays.toString(arr_output));
        return arr_output;
    }

    public static void task2run() {
        //2. Задать одномерный массив и
        // найти в нем минимальный и максимальный элементы.
        int[] array2 = {1, 8, 15, 46, 79, 2, 0};
        IntSummaryStatistics find = Arrays.stream(array2).summaryStatistics();
        System.out.println("min elem: " + find.getMin());
        System.out.println("max elem: " + find.getMax());

        //Arrays.sort(array2);
        // System.out.println("min elem: " + array2[0]);
        // System.out.println("max elem: " + array2[array2.length - 1]);

    }

    public static int[][] task3run() {
        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы
        // единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему
        // принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число n (размер двумерного массива): ");
        int n = input.nextInt();

        int[][] array3 = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                array3[i][j] = rnd.nextInt(10) + 1;
            }
        }
        System.out.println(Arrays.deepToString(array3));

        for (int i = 0; i < n; i++) {
            array3[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(array3));
        return array3;
    }

    public static int task4run() {
        // 4. В консоли запросить имя пользователя.
        // В зависимости от текущего времени,
        // вывести приветствие вида:
        //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();


        final Calendar calendar = Calendar.getInstance();

        StringBuilder timeFull = (new StringBuilder().append(calendar.get(Calendar.HOUR_OF_DAY))
                .append(":").append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND)).append(" "));
        System.out.println(timeFull);

        int timeH = (calendar.get(Calendar.HOUR_OF_DAY));

        if (timeH > 5 && timeH < 12) {
            //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
            System.out.printf("Доброе утро, %s!", name);
        }

        if (timeH > 12 && timeH < 18) {
            //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
            System.out.printf("Добрый день, %s!", name);
        }

        if (timeH > 18 && timeH < 23) {
            //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
            System.out.printf("Добрый вечер, %s!", name);
        }

        if (timeH > 0 && timeH < 5) {
            //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
            System.out.printf("Доброй ночи, %s!", name);
        }

        if (timeH == 23) {
            //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();
        return timeH;
    }

}






