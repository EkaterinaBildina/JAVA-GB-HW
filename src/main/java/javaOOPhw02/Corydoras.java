package javaOOPhw02;

public class Corydoras extends Fish{

    public Corydoras(String name) {
        super(name);
    }

    @Override
    public int size() {
        return 7;
    }

    @Override
    public String habitatLayer() {
        return "bottom";
    }

    @Override
    public String fishFood() {
        return "leftovers";
    }

    @Override
    public int getSwimSpeed() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("Коридорас: %s, Скорость плавания: %d", super.toString(), getSwimSpeed());
    }
}
