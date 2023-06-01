package OOP_Home_Work_2.Classes.BaseClasses;

import OOP_Home_Work_2.Interfaces.Jumpable;
import OOP_Home_Work_2.Interfaces.SpeedSwim;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private final List<AquariumAnimals> aquarium = new ArrayList<>();
    public Aquarium addAnimal(AquariumAnimals aquariumAnimals){
        aquarium.add(aquariumAnimals);
        return this;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В аквариуме живут:\n");
        for (AquariumAnimals animal: aquarium) {
            builder.append(animal)
                    .append('\n');
        }
        return builder.toString();
    }
    private List<SpeedSwim> getSwimmers() {
        List<SpeedSwim> swimmers = new ArrayList<>();
        for (AquariumAnimals animal : aquarium) {
            if (animal instanceof SpeedSwim) {
                swimmers.add((SpeedSwim) animal);
            }
        }
        return swimmers;
    }

    private List<Jumpable> getJumpers() {
        List<Jumpable> jumpers = new ArrayList<>();
        for (AquariumAnimals animal : aquarium) {
            if (animal instanceof Jumpable) {
                jumpers.add((Jumpable) animal);
            }
        }
        return jumpers;
    }

    public SpeedSwim getChampionSwimmer() {
        List<SpeedSwim> swimmers = getSwimmers();
        SpeedSwim ChampSwimmer = swimmers.get(0);
        for (SpeedSwim swimmer : swimmers) {
            if (swimmer.getSpeedSwim() > ChampSwimmer.getSpeedSwim()) {
                ChampSwimmer = swimmer;
            }
        }
        return ChampSwimmer;
    }

    public Jumpable getChampionJumper() {
        List<Jumpable> jumpers = getJumpers();
        Jumpable ChampJumpers = jumpers.get(0);
        for (Jumpable jumper : jumpers) {
            if (jumper.getJumpHeight() > ChampJumpers.getJumpHeight()) {
                ChampJumpers = jumper;
            }
        }
        return ChampJumpers;
    }
}

