package otherTasksClasses;

public class TelegramApp extends MessengerApp{

    TelegramApp(String accountName) {
        super(accountName);
    }
    @Override
    public void sendNotification(String message, NotificationType type){
        System.out.println(" Напоминание в Telegram для ["+accountName+"]: ["+message+"] (Тип: ["+type+"])");
        super.sendNotification(message, type);
    }
}
