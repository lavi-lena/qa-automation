package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    String agencyName;
    List<Client> seaLovers = new ArrayList<>();
    List<Client> mountainLovers = new ArrayList<>();

    TravelAgency(String agencyName){
        this.agencyName = agencyName;
    }
    void registerClient(Client c){

        if (c.wantsSea){
            seaLovers.add(c);
        }
        else {
            mountainLovers.add(c);
        }
    }
    void showStatistics(){
        System.out.println(agencyName+","+seaLovers.size()+", "+mountainLovers.size());
    }
}
