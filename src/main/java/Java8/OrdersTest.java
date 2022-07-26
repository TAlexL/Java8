package Java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class OrdersTest {

    @Test
    public void checkOrders(){
        Orders order1 = new Orders(230, false, "Marina");
        Orders order2 = new Orders(210, true, "Viktoria");
        Orders order3 = new Orders(560, false, "Sasha");
        Orders order4 = new Orders(50, true, "Julia");
        Orders order5 = new Orders(150, false, "Sergey");
        Orders order6 = new Orders(350, false, "Leonid");
        Orders order7 = new Orders(90, true, "Ivan");

        List<Orders>ordersList = Arrays.asList(order1, order2, order3, order4, order5, order6, order7);
    }
}
