package tasks.SmartControl;

public class SensorLog {
    String roomName;
    SensorType type;
    boolean isTriggered;
    int batteryLevel;

    public SensorLog(String roomName,SensorType type,int batteryLevel,boolean isTriggered){
        this.roomName = roomName;
        this.type = type;
        this.batteryLevel = batteryLevel;
        this.isTriggered = isTriggered;
    }
}
