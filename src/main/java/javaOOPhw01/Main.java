package javaOOPhw01;

import javaOOP.Product;
import javaOOP.VendingMachine;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.addProduct(new CupVolume("эспрессо", 10, 250, "малый", 0.3, 90))
                .addProduct(new CupVolume("капучино", 10, 160, "малый", 0.3, 74))
                .addProduct(new CupVolume("капучино", 12, 180, "средний", 0.4, 74))
                .addProduct(new CupVolume("капучино", 14, 200, "большой", 0.5, 74))
                .addProduct(new CupVolume("латтэ", 10, 220, "средний", 0.4, 68))
                .addProduct(new CupVolume("латтэ", 10, 220, "большой", 0.5, 68))
                .addProduct(new CupVolume("раф", 12, 280, "большой", 0.5, 65));

        System.out.println(coffeeMachine);

        System.out.println("Продажи кофе");
        CupVolume saleProduct1 = coffeeMachine.saleProduct("латтэ", "большой");
        System.out.println(saleProduct1);

        CupVolume saleProduct2 = coffeeMachine.saleProduct("раф", "большой");
        System.out.println(saleProduct2);

        System.out.println(coffeeMachine);


    }
}
