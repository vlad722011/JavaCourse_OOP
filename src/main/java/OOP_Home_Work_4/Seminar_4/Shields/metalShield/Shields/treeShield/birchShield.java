package OOP_Home_Work_4.Seminar_4.Shields.metalShield.Shields.treeShield;

public class birchShield implements treeShield {
    @Override
    public int armor() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("birchShield: %d ", armor());
    }
}
