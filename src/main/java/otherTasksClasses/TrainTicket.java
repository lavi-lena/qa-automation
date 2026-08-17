package otherTasksClasses;

public class TrainTicket extends Ticket implements Scannable{
    TrainTicket(String passengerName) {
        super(passengerName, TicketType.TRAIN);
    }

    @Override
    public void scan() {
        System.out.println("Билет на поезд для ["+getPassengerName()+"] успешно отсканирован на перроне");
    }
}
