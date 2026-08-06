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
    public static void allPassengersReady(){
        List<Passenger> bus1 = List.of(
                new Passenger("Иван", true),
                new Passenger("Мария", true),
                new Passenger("Петр", true)
        );
        List<Passenger> bus2 = List.of(
                new Passenger("Иван", true),
                new Passenger("Мария", false),
                new Passenger("Петр", true)
        );
        System.out.println("Автобус 1 готов? "+Passenger.isEveryoneReady(bus1));
        System.out.println("Автобус 2 готов? "+Passenger.isEveryoneReady(bus2));
    }
}
