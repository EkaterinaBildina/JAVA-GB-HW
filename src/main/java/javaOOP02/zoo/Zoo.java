package javaOOP02.zoo;

import javaOOP02.Radio;
import javaOOP02.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();

    public Zoo addAnimal(Animal someAnimal) {
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("В зоопарке: \n");
        for (Animal animal : zoo) {
            sb.append(animal).append('\n');
        }
        return sb.toString();
    }

    private List<Soundable> getSoundable() {
        List<Soundable> result = new ArrayList<>();
        for (Animal animal : zoo) {
            result.add(animal);
        }
        result.add(radio);
        return result;
    }

    public String getSounds(){
        StringBuilder builder = new StringBuilder();
        for (Soundable soundable: getSoundable()) {
            builder.append(soundable.sound()).append("\n");

        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo) {
            if(animal instanceof RunSpeed){
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }


    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners = runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed runner: runners) {
            if (champ.getRunSpeed() < runner.getRunSpeed()) {
                champ = runner;
            }
        }
        return champ;
    }
}
