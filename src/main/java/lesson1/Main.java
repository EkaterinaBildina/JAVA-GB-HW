package lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Object o = 1; GetType(o);
        o = 1.2; GetType(o);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
