package Seminar_4.Shields.metalShield;

public class ironShield implements metalShield{
    @Override
    public int armor() {
        return 8;
    }
    @Override
    public String toString() {
        return String.format("ironShield: %d ", armor());
    }
}
