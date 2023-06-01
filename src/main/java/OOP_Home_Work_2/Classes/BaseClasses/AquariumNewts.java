package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Classes.BaseClasses.Predators;

public abstract class AquariumNewts extends Predators {
    public AquariumNewts(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Тритон: " + super.toString();
    }

    @Override
    public String feed() {
        return "мелкой рыбой и земляными червями";
    }

    @Override
    public String move() {
        return "ползает";
    }
}
