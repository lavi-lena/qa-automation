public class DroneCourier extends Courier{
    DroneCourier(String name){
        super(name);
    }
    void flyToAddress(String address){
        route.add(address);
        System.out.println("Дрон летит по адресу: " + address);
        updateSystemStatus(DeliveryStatus.IN_TRANSIT);
    }
}
