package javaOOP04;

import javaOOP04.warriors.Archer;
import javaOOP04.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private List<T> team = new ArrayList<>();

    public void add(T element) {
        team.add(element);

    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth(){
        int teamHealth = 0;
        for (T type: this) {
            teamHealth += type.getHealthPoint();

        }
        return teamHealth;
    }

    public int maxAttackDistance(){
        int maxDistance = 0;
        for (T t: this) {
            if (!(t instanceof Archer)){
                continue;
            }
            int currentDistance = ((Archer)t).distance();
            if (maxDistance < currentDistance){
                maxDistance = currentDistance;

            }
        }
        return maxDistance;
    }
    public int getTeamAttack (){
        int teamAttack = 0;
        for (T t:this) {
            teamAttack += t.getWeapon().damage();
        }
        return teamAttack;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t:this) {
            builder.append(t).append('\n');
        }
        builder.append(String.format("TeamAtack: %d", getTeamAttack()));
        builder.append(String.format("TeamHealth: %d", getTeamHealth()));
        builder.append(String.format("TeamRange: %d", maxAttackDistance()));

    return builder.toString();
    }
}
