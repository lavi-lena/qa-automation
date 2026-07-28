public class AirConditioner implements SwitchedOn{
    private String model;
    AirConditioner(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public void turnOn(){
        System.out.println("Пошел холодный воздух");
    }
}
