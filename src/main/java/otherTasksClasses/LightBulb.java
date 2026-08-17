package otherTasksClasses;

public class LightBulb implements SwitchedOn {
    private String model;

    LightBulb(String model) {
        this.model = model;
    }

    public String getModel() {
        return model+ "заебись";
    }

    public void setModel(String model) {
        if(model == null){
            return;
        }
        this.model = model;
    }

    @Override
    public void turnOn(){
        System.out.println("Свет включен");
    }


}
