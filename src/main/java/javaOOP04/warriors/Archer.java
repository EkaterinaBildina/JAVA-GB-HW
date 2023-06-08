package javaOOP04.warriors;

import javaOOP04.shield.Shield;
import javaOOP04.wepons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shield>{
    public Archer(String name, int healthPoint, Ranged weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}
