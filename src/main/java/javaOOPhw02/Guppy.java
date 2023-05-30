package javaOOPhw02;

public class Guppy extends Fish{

    public Guppy(String name) {super(name);}

    @Override
    public int size() {
        return 3;
    }

    @Override
    public String habitatLayer() {
        return "middle";
    }

    @Override
    public String fishFood() {
        return "сухой корм (Tetra Guppy Color)";
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Гуппи: %s, Скорость плавания: %d", super.toString(), getSwimSpeed());
    }
}
