package javaOOP04.warriors;

import javaOOP04.shield.Shield;
import javaOOP04.wepons.Weapon;
import javaOOP04.wepons.meleeWeapon.Melee;
import javaOOP04.wepons.rangedWeapon.Ranged;

public class Infantryman extends Warrior<Melee, Shield>{
    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s, Distance: %d",super.toString());
    }
}
