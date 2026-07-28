import tasks.SmartControl.SensorLog;
import tasks.SmartControl.SensorType;
import tasks.SmartControl.SmartControl;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SmartControl smartControl = new SmartControl();
        smartControl.addSensorLog(new SensorLog("kitchen", SensorType.FIRE, 5, true));
        smartControl.addSensorLog(new SensorLog("kitchen", SensorType.WATER_LEAK, 50, true));
        smartControl.addSensorLog(new SensorLog("bedroom", SensorType.MOTION, 5, false));
        smartControl.addSensorLog(new SensorLog("bedroom", SensorType.FIRE, 35, true));


        List<String> danger = smartControl.runSecurityAudit();

    }
}