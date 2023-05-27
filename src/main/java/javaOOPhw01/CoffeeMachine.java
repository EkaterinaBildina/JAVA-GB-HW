package javaOOPhw01;

import javaOOP.Product;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<CoffeeType> assortmentList = new ArrayList<>();
    private double cash = 0;
    private int coffeeBeansKG = 1000;

    public CoffeeMachine addProduct(CoffeeType name) {
        assortmentList.add(name);
        return this;
    }

    public CoffeeType findProduct(String name) {
        //StringBuilder resultBuilder = new StringBuilder();

        for (CoffeeType type : assortmentList) {
            if (name.equals(type.getName())) {
                //resultBuilder.append(name).append("\n");
                return type;
            }
        }
        return null;
    }

    public CupVolume findByCupSize(String typeOfCup) {
        for (CoffeeType cup : assortmentList) {
            if (typeOfCup.equals(cup.getTypeOfCup())) {
                return (CupVolume) cup;
            }
        }
        return null;
    }

    public CupVolume saleProduct(String name, String typeOfCup) {
        CupVolume foundName = (CupVolume) findProduct(name);
        CupVolume foundCup = findByCupSize(typeOfCup);


        if (coffeeBeansKG > 10) {
            if (foundName != null && foundCup != null) {
                cash = cash + foundName.getPrice();
                coffeeBeansKG = coffeeBeansKG - foundName.getCupBeansWeight();
            }

        }
        return foundName;
    }

    public List<CoffeeType> getAssortmentList() {
        return assortmentList;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (CoffeeType name : assortmentList) {
            builder.append(name).append("\n");

        }
        builder.append("\n").append("Денег в автомате: ").append(cash).append("руб").append("\n").append("Наличие зерен кофе в автомате: ")
                .append(coffeeBeansKG).append("гр").append("\n");
        return builder.toString();
    }

}
