// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainTimofei {
    public static void main(String[] args) {
        //countOneTask2();
        //printArrayTask3();
        // task17041();
        // task17042();

        //System.out.println(task17043());
        //task17044();
    }


    public static void countOneTask2() {
        byte[] array = {1, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;

        }
        System.out.println(max);
    }

    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
    public static void printArrayTask3() {
        int[] nums = {3, 2, 2, 3, 5, 1, 3, 3, 5, 8, 1, 3};
        System.out.println(Arrays.toString(nums));
        int val = 3;
        int indexLastNotVal = 1;
        boolean find = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (!find) {
                    if (nums[nums.length - indexLastNotVal] != val) {
                        int temp = nums[i];
                        nums[i] = nums[nums.length - indexLastNotVal];
                        nums[nums.length - indexLastNotVal] = temp;
                        find = true;
                        indexLastNotVal = 1;

                    } else {
                        indexLastNotVal++;

                    }

                }
                find = false;
            }

        }
        System.out.println(Arrays.toString(nums));

    }


    public static void task17041() {
        //Дано четное число N (>0) и символы c1 и c2.
        //Написать метод, который вернет строку длины N,
        // которая состоит из чередующихся символов c1 и c2, начиная с c1.

        int N = 9;
        char symbc1 = 'A';
        char symbc2 = 'B';
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                result.append(symbc1);
            } else {
                result.append(symbc2);
            }

        }
        System.out.println(result.toString());

    }

    public static void task17042() {
        //Напишите метод, который сжимает строку.
        //Пример: вход aaaabbbcdd.
        String input = "aaaabbbcdd" + " ";

        char[] array = input.toCharArray();
        StringBuilder result = new StringBuilder();

        int count = 1;
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            char check = array[i];

            if (check == array[i + 1]) {
                count ++;
            } else {
                if (count == 1) {
                    result.append(check);
                } else {
                    result.append(check).append(count);
                }
                count = 1;
            }

        }
        System.out.println(result);
    }


    public static boolean task17043() {
        // Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String polindrom = input.nextLine();

        char[] arrayP = polindrom.toCharArray();
        System.out.println(Arrays.toString(arrayP));

        for (int i = 0; i < arrayP.length / 2; i++) {
            if (arrayP[i] != arrayP[arrayP.length - i - 1]) {
                return false;
            }

        }
        return true;

    }

    public static void task17044() throws IOException {
        //Напишите метод, который составит строку,
        // состоящую из 100 повторений слова TEST и метод,
        // который запишет эту строку в простой текстовый файл,
        // обработайте исключения.

            StringBuilder result = new StringBuilder();
            result.append("TEST".repeat(100));
            System.out.println(result);

            File output = new File("Text.txt");
            FileWriter writer = new FileWriter(output);


    }


}

