package javaOOP02.animals;

import javaOOP02.zoo.RunSpeed;

public class Duck extends Bird implements RunSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Krya-krya";
    }

    @Override
    public String feed() {
        return "zerno";
    }


    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public String toString() {
       // return String.format("Duck: %s, Speed: %d", super.toString(), getRunSpeed());
        return String.format("Duck: %s", super.toString());
    }
}
