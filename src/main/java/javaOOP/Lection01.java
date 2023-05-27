package javaOOP;

public class Lection01 {

    public static void main(String[] args) {
        VendingMachine apparat = new VendingMachine();
        apparat.addProduct(new Chocolate("шоколад", 10, "темный", "с орехом", 120))
                .addProduct(new Product("яблоко", 5))
                .addProduct(new Product("вода", 2))
        .addProduct(new Cheese("Российский", 220, "твердый", 100));


        //for (Product product : apparat.getVending()) {
        //    System.out.println(product);
        System.out.println(apparat);


        Product product = apparat.findProduct("яблоко");
        System.out.println(product);

        System.out.println("Продажи товара");
        Product saleProduct = apparat.saleProduct("яблоко");
        System.out.println(saleProduct);
        Product saleProduct2 = apparat.saleProduct("вода");
        System.out.println(saleProduct2);
        System.out.println("Сейчас денег в аппарате");
        System.out.println(apparat.getCash());


        System.out.println(apparat);
    }
}

