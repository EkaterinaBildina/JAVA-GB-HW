package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        readerList();
    }

    private static void readerList() {
        //Каталог товаров книжного магазина сохранен в виде двумерного списка
        // List<ArrayList<String>> так,
        // что на 0й позиции каждого внутреннего списка содержится название жанра,
        // а на остальных позициях - названия книг.
        // Напишите метод для заполнения данной структуры(можно через консоль).
        //Пример:
        //"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
        //"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
        //"Детектив", "Десять негритят".
        //"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".

        Scanner iScanner = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();

        //System.out.printf("Введите количество жанров: ");
        //String Size = iScanner.nextLine();

        int Size = 2;

        for (int i = 0; i < Size; i++) {
            System.out.printf("Введите Жанр книги: ");
            String inputBookName = iScanner.nextLine();

            ArrayList<String> genreList = new ArrayList<>();
            genreList.add(inputBookName);

            System.out.printf("Введите количество книг в жанре: ");
            int bookQty = Integer.parseInt(iScanner.nextLine());

            for (int j = 0; j < bookQty; j++) {
                    System.out.printf("Введите название книги: ");
                    String inputGenre = iScanner.nextLine();
                    genreList.add(inputGenre);
               }

            //System.out.println(genreList);
            bookList.add(genreList);
        }
        bookList.forEach(System.out::println);

    }

}



