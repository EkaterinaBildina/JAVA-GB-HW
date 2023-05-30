package javaOOPhw02;

public class Pangasius extends Fish{
    public Pangasius(String name) {super(name);}

    @Override
    public int size() {
        return 20;
    }

    @Override
    public String habitatLayer() {
        return "middle";
    }

    @Override
    public String fishFood() {
        return "мелкие рыбы, креветки, ракообразные, насекомые, фрукты, водная растительность(TetraMin Flakes)";
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Пангасиус: %s, Скорость плавания: %d ", super.toString(), getSwimSpeed());
    }
}
