package Seminar_4.Weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 100;
    }

    @Override
    public String toString() {
        return String.format("CrossBow: %d ", damage());
    }

}