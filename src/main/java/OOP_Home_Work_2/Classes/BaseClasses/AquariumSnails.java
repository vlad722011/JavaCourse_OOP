package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumAnimals;

public abstract class AquariumSnails extends AquariumAnimals{
    public AquariumSnails(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Улитка: " + super.toString();
    }

    @Override
    public String feed() {
        return "кормом для рыб";
    }

    @Override
    public String move() {
        return "очень медленно ползает";
    }
}
