package Seminar_4.Weapons.meleeWeapon;

public class Sword implements Melee{
    @Override
    public int damage() {
        return 4;
    }

    @Override
    public String toString() {
        return String.format("Sword: %d ", damage());
    }
}
