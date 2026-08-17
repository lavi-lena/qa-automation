package otherTasksClasses;

public class Order {
    int id;
    String dishName;
    OrderStatus status;

    Order(int id,String dishName){
        this.id = id;
        this.dishName = dishName;
        this.status = OrderStatus.NEW;
    }
}
