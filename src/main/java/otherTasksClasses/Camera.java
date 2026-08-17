package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Camera {
    String brand;
    List<String> gallery = new ArrayList<>();

    Camera(String brand){
        this.brand = brand;
    }
    private void takePhoto(String mode, int ISO){
        String zapis = "Снимок сделан! Режим: ["+mode+"], Светочувствительность ISO: ["+ISO+"]";
        gallery.add(zapis);
        System.out.println(zapis);
    }
    public void clickButton(){
        takePhoto("Авто", 200);
    }
    public void clickButton(String customMode){
        takePhoto(customMode, 400);
    }
    public void clickButton(String customMode, int customISO){
        takePhoto(customMode, customISO);
    }
}
