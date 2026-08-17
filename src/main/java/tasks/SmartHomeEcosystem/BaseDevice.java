package tasks.SmartHomeEcosystem;

public abstract class BaseDevice implements SmartDevice {
    private String modelName;
    private boolean isSwitchedOn = false;

    BaseDevice(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public boolean getIsSwitchedOn() {
        return isSwitchedOn;
    }

    public void setSwitchedOn(boolean isSwitchedOn) {
        this.isSwitchedOn = isSwitchedOn;
    }

    public void turnOn() {
        isSwitchedOn = true;
        System.out.println("Устройство " + modelName + " включено");
    }

    public void turnOff() {
        isSwitchedOn = false;
        System.out.println("Устройство " + modelName + " не включено");

    }
}
