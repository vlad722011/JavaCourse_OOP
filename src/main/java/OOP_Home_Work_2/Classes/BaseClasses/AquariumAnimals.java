package OOP_Home_Work_2.Classes.BaseClasses;

public abstract class AquariumAnimals {
    private String name;

    public AquariumAnimals(String name) {
        this.name = name;
    }

    public abstract String feed();

    public abstract String move();

    @Override
    public String toString() {
        return String.format("%s, питается: %s, %s.", name, feed(),move());
    }
}
