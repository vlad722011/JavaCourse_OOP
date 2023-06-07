package Seminar_4.Shields.metalShield.Shields.metalShield;

public class bronzeShield implements metalShield {
    @Override
    public int armor() {
        return 7;
    }
    @Override
    public String toString() {
        return String.format("bronzeShield: %d ", armor());
    }
}
