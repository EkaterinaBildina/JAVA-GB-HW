package javaOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class VendingMachine {
    private List<Product> vending = new ArrayList<>();
    private double cash = 0;
    public VendingMachine addProduct(Product prodName){
        vending.add(prodName);
        return this;
    }

    public List<Product> getVending(){
        return  vending;
    }

    public Product findProduct(String name){
        for (Product prod : vending){
            if (name.equals(prod.getProductName())){
                return prod;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Product saleProduct(String name){
        Product found = findProduct(name);
        if (found != null){
            cash = cash + found.getProductPrice();
            vending.remove(found);
        }
        return found;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Product product : vending){
            builder.append(product).append("\n");

        }
        return builder.toString();
    }
}
