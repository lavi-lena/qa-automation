import java.util.ArrayList;
import java.util.List;

public class Courier {
    String name;
    List<String> route = new ArrayList<>();

    Courier(String name){
        this.name = name;
    }
    protected void updateSystemStatus(DeliveryStatus status){
        System.out.println("Курьер " + name + " обновил статус доставки на: " + status);
    }
}
