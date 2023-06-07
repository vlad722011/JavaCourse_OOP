package Seminar_4;

import Seminar_4.Shields.metalShield.bronzeShield;
import Seminar_4.Shields.metalShield.ironShield;
import Seminar_4.Shields.metalShield.platinumShield;
import Seminar_4.Shields.treeShield.birchShield;
import Seminar_4.Shields.treeShield.oakShield;
import Seminar_4.Warriors.Archer;
import Seminar_4.Warriors.Infantryman;
import Seminar_4.Warriors.Warrior;
import Seminar_4.Weapons.meleeWeapon.Axe;
import Seminar_4.Weapons.meleeWeapon.Sword;
import Seminar_4.Weapons.rangedWeapon.Bow;
import Seminar_4.Weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(),new oakShield()));
        team1.add(new Infantryman("John", 150,new Axe(),new platinumShield()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow(),new ironShield()));
        teamArchers.add(new Archer("Piter",100, new Bow(),new birchShield()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword(),new bronzeShield()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        System.out.println("-----------");
        System.out.println();
        System.out.println("Битва");
        Warrior warriorOne = new Archer("Robin", 100, new Bow(),new oakShield());
        System.out.println("Воин один: " + warriorOne);

        Warrior warriorTwo = new Infantryman("John", 150,new Axe(),new platinumShield());
        System.out.println("Воин два: " + warriorTwo);
        Battle battle = new Battle(warriorOne, warriorTwo);
        battle.fight();
        System.out.println();
        if(warriorOne.getHealthPoint() == 0){
            System.out.println("Битву выиграл:" + warriorTwo);
        } else {
            System.out.println("Битву выиграл:" + warriorOne);
        }
    }
}