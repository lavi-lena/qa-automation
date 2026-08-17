package otherTasksClasses;

public class VacuumRobot extends Robot{
    VacuumRobot(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void startCleaning(){
        System.out.println("Робот пылесосит ковры");
    }
}
