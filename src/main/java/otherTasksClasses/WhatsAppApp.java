package otherTasksClasses;

public class WhatsAppApp extends MessengerApp {
    WhatsAppApp(String accountName) {
        super(accountName);
    }

    @Override
    public void sendNotification(String message, NotificationType type){
        System.out.println("Сообщение в вацап: "+message+" ^)");
    }
}
