package tasks.BookingManager;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
  public   List<Room> allRooms = new ArrayList<>();

    public Room findAndBookRoom(RoomClass desiredClass, double maxBudget){
        for (Room room:allRooms){
            if (room.getRoomClass()==desiredClass && !room.getIsOccupied() && room.getPricePerNight()<=maxBudget){
                room.setIsOccupied(true);
                System.out.println("Успешно забронирован номер ["+room.getRoomNumber()+"]");
                return room;
            }
        }
        System.out.println("К сожалению, подходящих свободных номеров нет");
        return null;
    }
}
