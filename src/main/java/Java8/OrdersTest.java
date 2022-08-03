package Java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OrdersTest {

    @Test
    public void checkOrders(){
        Order order1 = new Order(230, false, "Marina");
        Order order2 = new Order(210, true, "Viktoria");
        Order order3 = new Order(560, false, "Sasha");
        Order order4 = new Order(50, true, "Julia");
        Order order5 = new Order(150, false, "Sergey");
        Order order6 = new Order(350, false, "Leonid");
        Order order7 = new Order(90, true, "Ivan");

        List<Order>ordersList = Arrays.asList(order1, order2, order3, order4, order5, order6, order7);

        getAnyCondisions(ordersList, new CheckingCostumers() {
            @Override
            public boolean costumersCondition(Order order) {
                return order.price>300;
            }
        });
    }
    public void getAnyCondisions(List<Order>ordersList, CheckingCostumers checkingCostumers){
        for(Order order : ordersList){
            if(checkingCostumers.costumersCondition(order)){
                System.out.println(order);
            }
        }
    }
}
