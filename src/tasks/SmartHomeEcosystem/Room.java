package tasks.SmartHomeEcosystem;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomName;
    private List<SmartDevice> devices = new ArrayList<>();
    private List<String> incidentLogs = new ArrayList<>();

    Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void startSecurityCheck() {
        try {
            for (SmartDevice smartDevice : devices) {
                if (smartDevice.getType() == DeviceType.SECURITY) {
                    SecurityCamera camera = (SecurityCamera) smartDevice;
                    if (camera.getRiskLevel() == RiskLevel.HIGH) {
                        throw new SecurityAlertException("Обнаружено проникновение в комнату " + roomName);
                    }
                }
            }
        } catch (SecurityAlertException s) {
            incidentLogs.add(s.getMessage());
            System.out.println("⚠️ Срочно высылаем охрану!");


        }
    }

    public double calculateEnergyCost() {
        double totalCost = 0;
        for (SmartDevice smartDevice : devices) {
            if (smartDevice.getIsSwitchedOn()) {
                double deviceCost = smartDevice.getType() == DeviceType.HEATING ? 50.0 : 10.0;
                totalCost = totalCost + deviceCost;


            }
        }
        return totalCost;
    }
}
