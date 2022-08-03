package Java8;

public class Order {
    int price;
    boolean vegan;
    String customerName;

    public Order(int price, boolean vegan, String ordersName) {
        this.price = price;
        this.vegan = vegan;
        this.customerName = ordersName;
    }
    @Override
    public String toString(){
        return "Your eat cost " + price + " for " + vegan + "by " + customerName;
    }
}
