package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Depot {
    String city;
    List<Vehicle> ecoFriendly = new ArrayList<>();
    List<Vehicle> regular = new ArrayList<>();

    Depot(String city){
        this.city = city;
    }

    void parkVehicle(Vehicle v){
        if(v.engineType==EngineType.ELECTRIC){
            ecoFriendly.add(v);
        }
        else {
            regular.add(v);
        }
    }
    void showDepotStatus(){
        System.out.println(ecoFriendly.size()+", "+ regular.size());
    }
}
