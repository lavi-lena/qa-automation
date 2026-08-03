package tasks.SmartHomeEcosystem;

public class SecurityCamera extends BaseDevice{
    private RiskLevel riskLevel = RiskLevel.LOW;


    SecurityCamera(String modelName) {
        super(modelName);
    }

    public RiskLevel getRiskLevel() {
        return riskLevel;
    }

    @Override
    public DeviceType getType(){
        return DeviceType.SECURITY;
    }
    public void detectMotion(String target){
        if (target.equals("Вор")){
            riskLevel = RiskLevel.HIGH;
        }
    }
}
