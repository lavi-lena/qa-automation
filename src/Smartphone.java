public class Smartphone {
    String model;
    String os;
    int batteryPercentage;


    Smartphone(String model) {
        this.model = model;
        os = "Android";
        this.batteryPercentage = 100;
    }
        void printInfo(){
            System.out.println("телефон:"+this.model+",o.c:"+os+",заряд батареи:"+batteryPercentage);
        }
    }

