package OOP_Home_Work_2.Classes.Instances;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumFish;

public class GuppiFish extends AquariumFish {

    public GuppiFish(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwim() {
        return 12;
    }
}
