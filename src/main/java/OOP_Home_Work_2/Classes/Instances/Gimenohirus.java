package OOP_Home_Work_2.Classes.Instances;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumFrogs;

public class Gimenohirus extends AquariumFrogs {
    public Gimenohirus(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwim() {
        return 7;
    }

    @Override
    public int getJumpHeight() {
        return 38;
    }
}
