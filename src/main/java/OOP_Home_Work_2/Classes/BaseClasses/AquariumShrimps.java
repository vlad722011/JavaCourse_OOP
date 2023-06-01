package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Classes.BaseClasses.Herbivores;

public abstract class AquariumShrimps extends Herbivores {
    public AquariumShrimps(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Креветка: " + super.toString();
    }

    @Override
    public String feed() {
        return "растениями, мхом, корягами";
    }

    @Override
    public String sound() {
        return "всегда молчит";
    }

    @Override
    public String move() {
        return "может ползать и плавать хвостом вперед";
    }
}
