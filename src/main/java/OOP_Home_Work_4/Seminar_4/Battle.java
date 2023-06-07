package OOP_Home_Work_4.Seminar_4;
import OOP_Home_Work_4.Seminar_4.Warriors.Warrior;

public class Battle {
    private Warrior w1;
    private Warrior w2;

    public Battle(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
    }

    public void fight(){
        while (w1.getHealthPoint() > 0 && w2.getHealthPoint() > 0){
            int damage1 = w1.hit();
            int armor2 = w2.getShield().armor();
            int damageDone1 = damage1 - armor2;
            if(damageDone1 < 0){
                damageDone1 = 0;
            }
            System.out.println("Первый воин атакует второго с силой: " + damage1);
            System.out.println("Второй воин ставит щит силой: " + armor2);
            System.out.println("Итоговый урон: " + damageDone1);
            w2.reduceHealth(damage1, armor2);
            int damage2 = w2.hit();
            int armor1 = w1.getShield().armor();
            int damageDone2 = damage2 - armor1;
            if(damageDone2 < 0){
                damageDone2 = 0;
            }
            System.out.println("Второй воин атакует первого с силой : " + damage2);
            System.out.println("Первый воин ставит щит силой : " + armor1);
            System.out.println("Итоговый урон: " + damageDone2);
            w1.reduceHealth(damage2, armor1);
            System.out.println(w1);
            System.out.println(w2);
        }
    }
}