package OOP_Home_Work_2.Classes.Instances;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumFish;

public class GoldFish extends AquariumFish {
    public GoldFish(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwim() {
        return 18;
    }
}
