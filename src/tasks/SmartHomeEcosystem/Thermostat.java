package tasks.SmartHomeEcosystem;

public class Thermostat extends BaseDevice {
    int currentTemperature = 22;

  public   Thermostat(String modelName) {
        super(modelName);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.HEATING;
    }

    public void setTemperature(int temp) {
        currentTemperature = temp;
        System.out.println("Температура изменена на " + currentTemperature + " градусов");

    }

    public void setTemperature(int temp, boolean ecoMode) {
        if (ecoMode) {
            currentTemperature = 18;
        } else {
            currentTemperature = temp;
        }
        System.out.println("Температура изменена на " + currentTemperature + " градусов");
    }
}
