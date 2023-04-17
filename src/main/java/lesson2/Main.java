// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        countOneTask2();
        printArrayTask3();
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



}

