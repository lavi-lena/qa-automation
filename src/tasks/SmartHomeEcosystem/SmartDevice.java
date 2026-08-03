package tasks.SmartHomeEcosystem;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    DeviceType getType();
    boolean getIsSwitchedOn();
}
