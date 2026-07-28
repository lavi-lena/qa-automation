import java.util.ArrayList;
import java.util.List;

public class MessengerApp {
    String accountName;
    protected List<String> archive = new ArrayList<>();

    MessengerApp(String accountName){
        this.accountName = accountName;
    }
    public void sendNotification(String message, NotificationType type){
        System.out.println("Отправлено базовое уведомление: " + message);
        archive.add(message);
    }
}
