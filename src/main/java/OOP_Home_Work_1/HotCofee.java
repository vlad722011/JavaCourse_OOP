package OOP_Home_Work_1;

public class HotCofee extends HotDrink {
    private int temperature;
    private int price;
    public HotCofee(String drinkName, int volumeDrink, int drinkPrice, int temperature) {
        super(drinkName, volumeDrink, drinkPrice);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", температура кофе: %d градусов.", temperature);
    }
    public int getTemperature() {
        return temperature;
    }
}
