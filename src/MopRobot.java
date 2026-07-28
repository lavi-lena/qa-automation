public class MopRobot extends Robot{
    MopRobot(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void startCleaning(){
System.out.println("Робот моет полы водой");
    }
}
