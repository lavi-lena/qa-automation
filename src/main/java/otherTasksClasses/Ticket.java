package otherTasksClasses;

public class Ticket {
    private String passengerName;
    private TicketType type;

    Ticket(String passengerName,TicketType type){
        this.passengerName = passengerName;
        this.type = type;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public TicketType getType() {
        return type;
    }


}
