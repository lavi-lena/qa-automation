package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class SmartSpeaker {
    private String model;
    private int volume = 50;
    private List<String> commandHistory = new ArrayList<>();

    SmartSpeaker(String model,int volume){
        this.model = model;
        this.volume = volume;
    }
    public void playMusic(String songName){
        String textHistory = "Включаю песню: ["+songName+"]";
        System.out.println(textHistory);
        commandHistory.add(textHistory);
    }
    public void playMusic(String songName, int volume){
        this.volume = volume;
        String textHistory = "Громкость изменена на ["+ this.volume +"]";
        System.out.println(textHistory);
        commandHistory.add(textHistory);
        playMusic(songName);
    }
    void showHistory(){
        System.out.println(commandHistory.size());
    }
}
