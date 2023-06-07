package OOP_Home_Work_4.Seminar_4.Shields.metalShield;

public class platinumShield implements metalShield {
    @Override
    public int armor() {
        return 10;
    }
    @Override
    public String toString() {
        return String.format("platinumShield: %d ", armor());
    }
}
