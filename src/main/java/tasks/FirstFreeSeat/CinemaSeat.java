package tasks.FirstFreeSeat;

import java.util.ArrayList;
import java.util.List;

public class CinemaSeat {
    private int seatNumber;
    private boolean isOccupied;

    public CinemaSeat(int seatNumber,boolean isOccupied){
        this.seatNumber = seatNumber;
        this.isOccupied = isOccupied;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public static void firstFreeSeat(){
        List<CinemaSeat> cinemaSeatList = new ArrayList<>();
        cinemaSeatList.add(new CinemaSeat(1, true));
        cinemaSeatList.add(new CinemaSeat(2, true));
        cinemaSeatList.add(new CinemaSeat(3, false));
        cinemaSeatList.add(new CinemaSeat(4, false));

        CinemaSeat freeSeat = cinemaSeatList.stream()
                .filter(seat -> !seat.getIsOccupied())
                .findFirst()
                .orElse(null);
        System.out.println("Свободное место: "+freeSeat.getSeatNumber());
    }
}
