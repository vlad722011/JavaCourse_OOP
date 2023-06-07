package Seminar_4.Weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 8;
    }

    @Override
    public int distance() {
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow: %d ", damage());
    }
}