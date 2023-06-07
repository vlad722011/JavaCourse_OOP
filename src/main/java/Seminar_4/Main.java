package Seminar_4;

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
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150,new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Piter",100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);

        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe()), (new Archer("Robin", 100, new Bow())));
        battle1.fight();
    }
}