package javaOOP02;

import javaOOP02.animals.Animal;
import javaOOP02.animals.Bear;
import javaOOP02.animals.Cow;
import javaOOP02.animals.Duck;
import javaOOP02.zoo.RunSpeed;
import javaOOP02.zoo.Zoo;

public class MainClassForSeminarTwo {
    public static void main(String[] args){
        Animal bear = new Bear("Potapych");
        Animal cow = new Cow("Murka");

        //System.out.println(bear);
       // System.out.println(cow);

        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Donald"));
        System.out.println(zoo);

        System.out.println(zoo.getSounds());

        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println(champ);

        for (RunSpeed runner: zoo.runners()) {
            System.out.println(runner);
        }


    }
}
