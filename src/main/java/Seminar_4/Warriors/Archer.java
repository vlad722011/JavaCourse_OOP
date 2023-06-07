package Seminar_4.Warriors;

import Seminar_4.Weapons.Weapon;
import Seminar_4.Weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged>{
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }

    public int distance(){
        return super.getWeapon().distance();
    }

    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}