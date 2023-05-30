package javaOOP02.animals;

import javaOOP02.zoo.Soundable;

public abstract class Animal implements Soundable {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String sound();

    public abstract String feed();

    public abstract int getRunSpeed();

    @Override
    public String toString() {
        return String.format("Name: %s, Food: %s, Speed: %d", name, feed(), getRunSpeed());
    }

}


