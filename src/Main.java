

import tasks.LogisticsCenter.LogisticsCenter;
import tasks.LogisticsCenter.Parcel;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel("hihi",30.0,false);
        Parcel parcel2 = new Parcel("",30.0,false);
        Parcel parcel3 = new Parcel("hohi",30.0,true);
        Parcel parcel4 = new Parcel("hiii",10.0,false);

        List<Parcel> conveyorBelt = new ArrayList<>();
        conveyorBelt.add(parcel1);
        conveyorBelt.add(parcel2);
        conveyorBelt.add(parcel3);
        conveyorBelt.add(parcel4);

        LogisticsCenter logisticsCenter = new LogisticsCenter();
        logisticsCenter.processIncomingDelivery(conveyorBelt);





    }
}