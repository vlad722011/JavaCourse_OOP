package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumAnimals;
import OOP_Home_Work_2.Interfaces.SpeedSwim;

public abstract class AquariumFish extends AquariumAnimals implements SpeedSwim {

    public AquariumFish(String name) {
        super(name);
    }


    public int getSpeedSwim() {
        return 30;
    }
    @Override
    public String toString() {
        return "Аквариумная рыбка: " + super.toString() + String.format(" Скорость плавания: %d метров в минуту.", getSpeedSwim());
    }

    @Override
    public String feed() {
        return "кормом для рыб";
    }

    @Override
    public String move() {
        return "плавает";
    }


}
