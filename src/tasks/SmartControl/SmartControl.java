package tasks.SmartControl;

import java.util.ArrayList;
import java.util.List;

public class SmartControl {
    List<SensorLog> currentLogs = new ArrayList<>();

  public   void addSensorLog(SensorLog log) {
        currentLogs.add(log);
    }

    public List<String> runSecurityAudit() {
        List<String> dangerRooms = new ArrayList<>();
        for (SensorLog sensorLog : currentLogs) {
            if (sensorLog.batteryLevel < 10) {
                System.out.println("Внимание: в комнате [" + sensorLog.roomName + "] садится батарея датчика [" + sensorLog.type + "]");
            }
            if (sensorLog.isTriggered){
                if(sensorLog.type==SensorType.FIRE||sensorLog.type==SensorType.WATER_LEAK){
                   if(!dangerRooms.contains(sensorLog.roomName)){
                       dangerRooms.add(sensorLog.roomName);
                   }

                }
            }
        }
        return dangerRooms;
    }



}
