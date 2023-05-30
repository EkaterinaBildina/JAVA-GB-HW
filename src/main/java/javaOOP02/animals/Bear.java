package javaOOP02.animals;

public class Bear extends Predator {

    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound(){
        return "Reawr";
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }

    @Override
    public String toString(){
        return String.format("Bear: %s", super.toString());
    }



}
