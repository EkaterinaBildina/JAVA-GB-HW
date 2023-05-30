package javaOOP02.animals;

public class Cow extends Herbivores{

    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "Mooo";
    }

    @Override
    public int getRunSpeed() {
        return 10;
    }

    @Override
    public String toString(){
        return String.format("Cow: %s", super.toString());
    }
}
