package otherTasksClasses;

public class Robot {
    String serialNumber;

    Robot(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public void startCleaning(){
        System.out.println("Робот запускает базовую очистку");
    }
}
