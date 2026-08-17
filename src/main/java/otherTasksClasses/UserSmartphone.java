package otherTasksClasses;

public class UserSmartphone {
    private AudioPlayer currentApp;

    public void setPlayerApp(AudioPlayer app) {
        this.currentApp = app;
    }
    void pressPlayButton(){
        currentApp.start();
    }
}
