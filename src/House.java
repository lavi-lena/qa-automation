import java.util.ArrayList;
import java.util.List;

public class House {
    String address;
    List<Pet> roomies = new ArrayList<>();

    House(String address){
        this.address = address;
    }
    void wakeUpEveryone(){
        for (Pet pet:roomies){
            pet.makeSound();
        }
    }
}
