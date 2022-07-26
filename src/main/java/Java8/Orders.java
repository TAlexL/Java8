package Java8;

public class Orders {
    int price;
    boolean vegan;
    String customerName;

    public Orders(int price, boolean vegan, String ordersName) {
        this.price = price;
        this.vegan = vegan;
        this.customerName = ordersName;
    }
    @Override
    public String toString(){
        return "Your eat cost " + price + " for " + vegan + "by " + customerName;
    }
}
