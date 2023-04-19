package homework2;

import java.io.File;


public class HomeWork2FileWork {
    public static void main(String[] args) {
        //2.Напишите метод, который определит тип (расширение) файлов из текущей папки и
        // выведет в консоль результат вида:
        //1 Расширение файла: txt
        //2 Расширение файла: pdf
        //3 Расширение файла:
        //4 Расширение файла: jpg

        File dir = new File("C:\\Users\\FPS\\Desktop\\EBildina_Education\\JAVA\\Java-lesson-20230413\\src\\main\\java\\homework2");
        for (File item : dir.listFiles()) {

            if (item.isDirectory()) {
                System.out.println(item.getName() + " \t folder");
            } else {
                String fileName = item.getName();
                if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
                    System.out.println(item.getName() + " \t file" + " Расширение файла: " + fileName.substring(fileName.lastIndexOf(".") + 1));
                }
            }
        }

    }

}

