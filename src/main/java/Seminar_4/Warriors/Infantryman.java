package Seminar_4.Warriors;

import Seminar_4.Shields.Shield;
import Seminar_4.Weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Shield>{

    public Infantryman(String name, int healthPoint, Melee weapon, Shield shield) {
        super(name, healthPoint, weapon,shield);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}