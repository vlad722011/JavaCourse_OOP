package OOP_Home_Work_2.Classes.Instances;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumFrogs;

public class AlbinoClawedFrog extends AquariumFrogs {
    public AlbinoClawedFrog(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwim() {
        return 4;
    }

    @Override
    public int getJumpHeight() {
        return 48;
    }
}
