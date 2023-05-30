package javaOOPhw02;

public class Aquarium {
    public static void main(String[] args) {
        Fish guppy = new Guppy("Poe cilia reticulated");
        Fish pangasius = new Pangasius("Pangasius sanitwongsei");

        Inhabitants inhabitants = new Inhabitants();
        inhabitants.addFish(guppy).addFish(pangasius);
        System.out.println(inhabitants);

        System.out.println("--Swimmer-champion--");
        System.out.println(inhabitants.getSwimmerChampion());
    }

}
