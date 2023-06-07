package OOP_Home_Work_4.Seminar_4.Warriors;

import OOP_Home_Work_4.Seminar_4.Shields.Shield;
import OOP_Home_Work_4.Seminar_4.Weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Shield> {
    public Archer(String name, int healthPoint, Ranged weapon, Shield shield ) {
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