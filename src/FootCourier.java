public class FootCourier extends Courier{
    FootCourier(String name){
        super(name);
    }
   void walkToAddress(String address){
        route.add(address);
        System.out.println("Курьер идет пешком по адресу..."+address);
        updateSystemStatus(DeliveryStatus.IN_TRANSIT);
    }
}
