package javaOOP04.warriors;

import javaOOP04.shield.Shield;
import javaOOP04.wepons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon,S extends Shield> {

    private String name;
    private int healthPoint;
    private W weapon;
    private S shield;


    public Warrior(String name, int healthPoint, W weapon, S shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0,weapon.damage() + 1);
    }

    public void reduceHealth(int damage) {
        int protection = 0;
        if (shield != null){
            protection = shield.getProtection();
        }
       damage -= protection;
        if (damage < 0) {
            damage = 0;
        }
        healthPoint -= protection;
        if (healthPoint < 0){
            healthPoint = 0;
        }
    }


    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Shield: %d", name, weapon, healthPoint, shield);
    }
}
