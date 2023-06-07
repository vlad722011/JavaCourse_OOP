package Seminar_4.Shields.metalShield.Shields.treeShield;

public class oakShield implements treeShield {
    @Override
    public int armor() {
        return 6;
    }
    @Override
    public String toString() {
        return String.format("oakShield: %d ", armor());
    }
}
