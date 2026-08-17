package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    List<Order> orders = new ArrayList<>();

    Restaurant(String name){
        this.name = name;
    }
    void addOrder(Order o){
        orders.add(o);
    }

    void showActiveOrders(){
        for (Order zakaz:orders){
            if (zakaz.status ==OrderStatus.NEW || zakaz.status ==OrderStatus.COOKING){
                System.out.println(zakaz.dishName);
            }
        }
    }
}
