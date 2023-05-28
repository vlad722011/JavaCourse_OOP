package OOP_Home_Work_1;


public interface vendingMachine {
    public default vendingMachine addProduct(){
        return null;
    }
    public default vendingMachine saleProduct() {
        return null;
    }
    public  default String getProduct(){
        return null;
    };
}
