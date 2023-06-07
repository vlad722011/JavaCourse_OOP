package OOP_Home_Work_4.Seminar_4.Warriors;

import OOP_Home_Work_4.Seminar_4.Shields.Shield;
import OOP_Home_Work_4.Seminar_4.Weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, S extends Shield> {
    private final String name;
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

    public S getShield() {
        return shield;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public int hit() {
        Random rnd = new Random();
        return rnd.nextInt(0, weapon.damage() + 1);
    }

    public int putUpShield(){
        Random rnd = new Random();
        return rnd.nextInt(0, shield.armor() + 1);
    }

    public void reduceHealth(int damage, int armor) {
        int damageDone = damage - armor;
        if(damageDone < 0){
            damageDone = 0;
        }
        healthPoint -= damageDone;
        if (healthPoint < 0) {
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, HealthPoint: %d, Shield: %s", name, weapon, healthPoint, shield);
    }
}