package OOP_Home_Work_1;

public class HotTea extends HotDrink {
    private int temperature;
    private int price;
    public HotTea (String drinkName, int volumeDrink, int drinkPrice, int temperature) {
        super(drinkName, volumeDrink, drinkPrice);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", температура чая: %d градусов.", temperature);
    }
    public int getTemperature() {
        return temperature;
    }

}
