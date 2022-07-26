package Java8;

import java.util.List;

public class Filters {

    List<Orders> ordersList;

    Filters (List<Orders> ordersList){
        this.ordersList = ordersList;
    }
    public void filterByPrice(){
        for(Orders orders : ordersList){
            if(orders.price>200){
                System.out.println(orders);
            }
        }
    }
    public void filterByVegan(){
        for (Orders orders : ordersList){
            if(orders.vegan){
                System.out.println(orders);
            }
        }
    }
    public void filterByCostumerName(){
        for(Orders orders : ordersList){
            if(orders.customerName.length()>6){
                System.out.println(orders);
            }
        }
    }

}
