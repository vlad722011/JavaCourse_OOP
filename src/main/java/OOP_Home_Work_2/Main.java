package OOP_Home_Work_2;

import OOP_Home_Work_2.Classes.BaseClasses.*;
import OOP_Home_Work_2.Classes.Instances.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        AquariumAnimals aquariumAnimals1 = new GuppiFish("Гуппи");
        AquariumAnimals aquariumAnimals2 = new ScalariaFish("Скалярия");
        AquariumAnimals aquariumAnimals3 = new SomFish("Сом");
        AquariumAnimals aquariumAnimals4 = new BarbusFish("Барбус");
        AquariumAnimals aquariumAnimals5 = new DiscusFish("Дискус");

        System.out.println(aquariumAnimals1);
        System.out.println(aquariumAnimals2);
        System.out.println(aquariumAnimals3);
        System.out.println(aquariumAnimals4);
        System.out.println(aquariumAnimals5);
        System.out.println("_________________________________________________________________________________________");
        System.out.println();

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(new ScalariaFish("Скалярия")).addAnimal(new GuppiFish("Гуппи"))
                .addAnimal(new GoldFish("Золотая рыбка")).addAnimal(new RainbowFish("Радужница"))
                .addAnimal(new BabaultiShrimp("Бабаулти"))
                .addAnimal(new BlueDreamShrimp("Блю Дрим"))
                .addAnimal(new FarEasternShrimp("Дальневосточная"))
                .addAnimal(new AlbinoClawedFrog("Шпорцевая, альбинос"))
                .addAnimal(new Gimenohirus("Гименохирус"))
                .addAnimal(new YellowAmularia("Желтая Амулярия"))
                .addAnimal(new CrestedNewt("Гребенчатый тритон"));
        System.out.println(aquarium.toString());



        System.out.println("Чемпион по скорости плавания, среди жителей аквариума:");
        System.out.println(aquarium.getChampionSwimmer());

        System.out.println("Чемпион по прыжкам в высоту, среди животных аквариума:");
        System.out.println(aquarium.getChampionJumper());

    }
}
