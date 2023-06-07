package OOP_Home_Work_4.Seminar_4.Weapons.rangedWeapon;

public class CrossBow implements Ranged {
    @Override
    public int damage() {
        return 11;
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