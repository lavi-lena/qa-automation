package otherTasksClasses;

public class Car {
    String model;
    int fuelLiters;
    Car(String model,int fuelLiters){
        this.model = model;
        this.fuelLiters = fuelLiters;
    }
    void checkTrip(){
        String result = (fuelLiters >= 20)? "До дачи доедем!" : "Нужно заехать на заправку";
        System.out.println(result);
    }
}
