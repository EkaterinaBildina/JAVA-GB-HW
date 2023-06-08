package javaOOP04.wepons.meleeWeapon;

public class Axe implements  Melee {
    @Override
    public int damage() {
        return 5;
    }

    @Override
    public int distance() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Axe: %d", damage());
    }
}
