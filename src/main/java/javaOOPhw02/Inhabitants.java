package javaOOPhw02;

import java.util.ArrayList;
import java.util.List;

public class Inhabitants {
    private final List<Fish> aquariumInhabitants = new ArrayList<>();
    private final SwimmingCompetition swimmingCompetition = new SwimmingCompetition();

    public Inhabitants addFish(Fish newFish) {
        aquariumInhabitants.add(newFish);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("В аквариуме обитают: ");
        for (Fish fish : aquariumInhabitants) {
            sb.append("\n").append(fish);
        }
        return sb.toString();
    }

    public List<SwimmingSpeed> swimmers() {
        List<SwimmingSpeed> swimmer = new ArrayList<>();
        for (Fish fish : aquariumInhabitants) {
            if (fish instanceof SwimmingSpeed){
                swimmer.add((SwimmingSpeed) fish);
            }

        } return swimmer;
    }

    public SwimmingSpeed getSwimmerChampion(){
        List<SwimmingSpeed> swimmers = swimmers();
        SwimmingSpeed champ = swimmers.get(0);
        for (SwimmingSpeed runner: swimmers){
            if(champ.getSwimSpeed() < runner.getSwimSpeed()){
                champ = runner;
            }
        }
        return champ;
    }



}
