package homework3;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.valueOf;
import static javax.swing.UIManager.get;

public class task01 {

    public static void main(String[] args) {
        task01();
    }

    private static boolean task01() {
        //1. Создать список типа ArrayList<String>.
        // Поместить в него как строки, так и целые числа.
        // Пройти по списку, найти и удалить целые числа.
        // Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"}
        // -> {"Яблоко", "Апельсин", "Дыня"}

        ArrayList<String> mixTypeList = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(mixTypeList);

        //ArrayList<String> numForDelete = new ArrayList<>(Arrays.asList("11", "13", "17"));
        ArrayList<String> numForDelete = new ArrayList<>();
        //mixTypeList.removeAll(numForDelete);
        //System.out.println(mixTypeList);


        for (i = 0; i < mixTypeList.size(); i++) {
            String stringElem = mixTypeList.get(i);
            try {
                Integer.parseInt(stringElem);
            } catch (Exception e) {
                return false;
            }

            return numForDelete.add(stringElem);

        }
        System.out.println(numForDelete);
        mixTypeList.removeAll(numForDelete);
        System.out.println(mixTypeList);

        return false;
    }


}





