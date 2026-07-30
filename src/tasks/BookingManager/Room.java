package tasks.BookingManager;

public class Room {
    private int roomNumber;
    private RoomClass roomClass;
    private double pricePerNight;
    private boolean isOccupied;

    public Room(int roomNumber,RoomClass roomClass,double pricePerNight,boolean isOccupied){
        this.roomNumber = roomNumber;
        this.roomClass = roomClass;
        this.pricePerNight = pricePerNight;
        this.isOccupied = isOccupied;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomClass getRoomClass() {
        return roomClass;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
    public boolean getIsOccupied(){
        return isOccupied;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomClass(RoomClass roomClass) {
        this.roomClass = roomClass;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setIsOccupied(boolean isOccupied) {
       this.isOccupied = isOccupied;
    }
}
