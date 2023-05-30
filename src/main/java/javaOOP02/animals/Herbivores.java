package javaOOP02.animals;

public abstract class Herbivores extends Animal {

    public Herbivores(String name) {
        super(name);
    }

    @Override
    public String feed(){
        return "grass";
    }

}
