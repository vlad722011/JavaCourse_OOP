package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Classes.BaseClasses.AquariumAnimals;
import OOP_Home_Work_2.Interfaces.Jumpable;
import OOP_Home_Work_2.Interfaces.SpeedSwim;

public abstract class AquariumFrogs extends AquariumAnimals implements Jumpable, SpeedSwim {
    public AquariumFrogs(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Лягушка: " + super.toString() + String.format(" Высота прыжка: %d сантиметров, скорость плавания %d метров в минуту.",getJumpHeight(), getSpeedSwim());
    }

    @Override
    public String feed() {
        return "мелким мотылем, земляными червями и планктонными ракообразными";
    }

    @Override
    public String move() {
        return "может ползать, плавать, прыгать";
    }

    @Override
    public int getJumpHeight() {
        return 30;
    }

    @Override
    public int getSpeedSwim() {
        return 15;
    }
}
