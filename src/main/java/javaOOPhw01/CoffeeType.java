package javaOOPhw01;

public class CoffeeType {
    private String name;

    private int cupBeansWeight;
    private int price;

    public CoffeeType(String name, int cupBeansWeight, int price) {
        this.name = name;
        this.cupBeansWeight = cupBeansWeight;
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Наименование: %s, Зерна: %d гр, Цена: %d руб", name, cupBeansWeight, price);
    }


    public String getName() {
        return name;
    }

    public int getCupBeansWeight() {
        return cupBeansWeight;
    }
    public int getPrice() {
        return price;
    }

    public String getTypeOfCup() {
        return getTypeOfCup();
    }
}
