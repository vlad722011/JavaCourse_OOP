package OOP_Home_Work_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements vendingMachine {

    private List<HotDrink> vendingMachineDrinks = new ArrayList<>();
    private double cash = 0;


    public HotDrinkVendingMachine addProduct(HotDrink drink) {
        vendingMachineDrinks.add(drink);
        return this;
    }

    public HotDrink saleProduct(String nameProduct) {
        HotDrink found = getProduct(nameProduct);
        if (found != null) {
            cash = cash + found.getDrinkPrice();
            vendingMachineDrinks.remove(found);
        }
        return found;
    }

    public HotDrink getProduct(String nameProduct) {
        for (HotDrink drink : vendingMachineDrinks) {
            if (nameProduct.equals(drink.getDrinkName())) {
                return drink;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public List<HotDrink> getVendingMachineDrinks() {
        return vendingMachineDrinks;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в вендинговом автомате: ").append(cash).append(" рублей").append("\n")
                .append("В автомате следующий горячие напитки в ассортименте: ").append("\n");
        for (HotDrink drink : vendingMachineDrinks) {
            builder.append(drink).append("\n");
        }
        return builder.toString();
    }

}
