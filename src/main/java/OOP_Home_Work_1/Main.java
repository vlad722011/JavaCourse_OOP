package OOP_Home_Work_1;

/*
   1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
   2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
      метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени,
      объёму и температуре.
   3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
      заложенную в программе.
   4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начальное состояние торгового автомата:");
        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.addProduct(new HotDrink("Яблочный сидр", 200, 100))
                .addProduct(new HotDrink("Глинтвейн",200,150))
                .addProduct(new HotDrink("Amaretto",200, 175))
                .addProduct(new HotTea("Красный цитрусовый чай",200,50, 70))
                .addProduct(new HotTea("Ягодный чай", 200,55, 70))
                .addProduct(new HotTea("Облепиховый чай", 200, 65, 70))
                .addProduct(new HotTea("Напиток из яблочной кожуры",200,30, 70))
                .addProduct(new HotCofee("Кофе Эспрессо", 200, 100, 65))
                .addProduct(new HotCofee("Кофе по-ирландски", 200, 110, 65))
                .addProduct(new HotCofee("Кофе Ристретто", 200, 120, 65))
                .addProduct(new HotCofee("Кофе Американо", 200, 100, 65))
                .addProduct(new HotCofee("Кофе Капучино", 200, 100, 65));
        System.out.println("_________________________________________________________________________________");
        System.out.println(vendingMachine);
        System.out.println("_________________________________________________________________________________");

        System.out.println("Ищем продукт в автомате по названию:");
        HotDrink foundProduct1 = vendingMachine.getProduct("Яблочный сидр");
        System.out.println(foundProduct1);
        HotDrink foundProduct2 = vendingMachine.getProduct("Кофе по-ирландски");
        System.out.println(foundProduct2);
        HotDrink foundProduct3 = vendingMachine.getProduct("Облепиховый чай");
        System.out.println(foundProduct3);

        System.out.println("_________________________________________________________________________________");
        System.out.println("Теперь что нибудь продадим из нашего автомата.");
        HotDrink hotDrink1 = vendingMachine.saleProduct("Кофе Капучино");
        System.out.println(hotDrink1);
        HotDrink hotDrink2 = vendingMachine.saleProduct("Напиток из яблочной кожуры");
        System.out.println(hotDrink2);
        HotDrink hotDrink3 = vendingMachine.saleProduct("Глинтвейн");
        System.out.println(hotDrink3);

        System.out.println("_________________________________________________________________________________");
        System.out.println("Текущее состояние торгового автомата:");
        System.out.println(vendingMachine);
        System.out.println("_________________________________________________________________________________");
    }
}
