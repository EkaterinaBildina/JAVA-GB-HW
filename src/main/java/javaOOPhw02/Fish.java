package javaOOPhw02;

public abstract class Fish implements SwimmingSpeed {

    protected String name;

    public Fish(String name) {
        this.name = name;
    }

    public abstract int size();
    public abstract String habitatLayer();

    public abstract String fishFood();


    public abstract int getSwimSpeed();

    @Override
    public String toString() {
        return String.format("Аквариумная Рыбка: %s, Размер тела: %d cm, Слой обитания: %s , Питается: %s", name, size(), habitatLayer(), fishFood());
    }
}
