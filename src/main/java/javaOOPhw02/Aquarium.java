package javaOOPhw02;

public class Aquarium {
    public static void main(String[] args) {
        Fish guppy = new Guppy("Poe cilia reticulated");
        Fish pangasius = new Pangasius("Pangasius sanitwongsei");
        Fish corydoras = new Corydoras("Corydoras");

        Inhabitants inhabitants = new Inhabitants();
        inhabitants.addFish(guppy).addFish(pangasius).addFish(corydoras);
        System.out.println(inhabitants);

        System.out.println("--Swimmer-champion--");
        System.out.println(inhabitants.getSwimmerChampion());
    }

}
