package tasks.LogisticsCenter;

import java.util.ArrayList;
import java.util.List;

public class LogisticsCenter {
    List<Parcel> heavyTruck = new ArrayList<>();
    List<Parcel> fragileBox = new ArrayList<>();
    List<Parcel> regularCourier = new ArrayList<>();

    public void processIncomingDelivery(List<Parcel> conveyorBelt){
        for (Parcel parcel:conveyorBelt){
            if (parcel.getId()==null || parcel.getId().isEmpty() ){
                System.out.println("Посылка без ID отклонена!");
                continue;
            }
            if (parcel.getFragile()){
                fragileBox.add(parcel);
            }
            else if(parcel.getWeight()>20.0){
                heavyTruck.add(parcel);


            }
            else {
                regularCourier.add(parcel);
            }
        }
        System.out.println("На фуре уехало посылок: "+heavyTruck.size()+", посылок, уехавших курьером: "+regularCourier.size()+", отложено в хрупкое: "+fragileBox.size());

    }
}
