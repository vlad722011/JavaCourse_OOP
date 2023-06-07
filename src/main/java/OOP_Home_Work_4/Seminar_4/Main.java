package OOP_Home_Work_4.Seminar_4;

import OOP_Home_Work_4.Seminar_4.Shields.metalShield.platinumShield;
import OOP_Home_Work_4.Seminar_4.Shields.treeShield.oakShield;
import OOP_Home_Work_4.Seminar_4.Warriors.Archer;
import OOP_Home_Work_4.Seminar_4.Warriors.Infantryman;
import OOP_Home_Work_4.Seminar_4.Warriors.Warrior;
import OOP_Home_Work_4.Seminar_4.Weapons.meleeWeapon.Axe;
import OOP_Home_Work_4.Seminar_4.Weapons.rangedWeapon.Bow;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------");
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