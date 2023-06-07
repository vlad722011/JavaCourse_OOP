package OOP_Home_Work_4.Seminar_4.Weapons.meleeWeapon;

public class Axe implements Melee {
    @Override
    public int damage() {
        return 16;
    }

    @Override
    public String toString() {
        return String.format("Axe: %d ", damage());
    }
}