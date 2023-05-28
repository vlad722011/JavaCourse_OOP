package OOP_Home_Work_1;

public class HotDrink {
    private String drinkName;
    private int volumeDrink;
    private int drinkPrice;

    public HotDrink(String drinkName, int volumeDrink, int DrinkPrice) {
        this.drinkName = drinkName;
        this.volumeDrink = volumeDrink;
        this.drinkPrice = DrinkPrice;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Объём: %d мл, цена: %d руб.", drinkName, volumeDrink, drinkPrice);
    }


    public String getDrinkName() {
        return drinkName;
    }

    public double getVolumeDrink() {
        return volumeDrink;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
}
