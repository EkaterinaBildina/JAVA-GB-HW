package homework5;


import com.sun.tools.javac.Main;

import java.util.*;
import java.util.Scanner;


public class HashMapToDo {
    public static void main(String[] args) {

        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();

        String name1 = new String("Bildina Ekaterina");
        String name2 = new String("Kantserys Elena");
        String name3 = new String("Lyaonava Anastasia");
        String name4 = new String("Odinets Anna");

        nameBook.put(0, name1);
        nameBook.put(1, name2);
        nameBook.put(2, name3);
        nameBook.put(3, name4);

        for (int i = 0; i < nameBook.size(); i++) {
            if (phoneBook.get(i) == null) {
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("8-985-888-44-" + i + i + ";" + "8-916-144-95-" + i + i);

            }
            System.out.println("Телефонные номера" + " " + nameBook.get(i) + " :" + phoneBook.get(i));
        }
    }
}

/*
class Book {
    private String phone;
    public Book(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(phone, book.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }
}
*/