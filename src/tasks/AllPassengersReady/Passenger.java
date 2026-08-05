package tasks.AllPassengersReady;

import java.util.List;

public class Passenger {
    private String name;
    private boolean hasTicket;

    public Passenger(String name, boolean hasTicket) {
        this.name = name;
        this.hasTicket = hasTicket;
    }

    public String getName() {
        return name;
    }

    public boolean getHasTicket() {
        return hasTicket;
    }
    public static boolean isEveryoneReady(List<Passenger> bus){
        return bus.stream()
                .allMatch(p -> p.getHasTicket());
    }
}
