package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    List<SwitchedOn> devices = new ArrayList<>();

    void activateAll(){
        for (SwitchedOn switchedOn:devices){
            switchedOn.turnOn();
        }
    }
}
