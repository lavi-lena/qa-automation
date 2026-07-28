import java.util.ArrayList;
import java.util.List;

public class ClinicQueue {
    List<Patient> patients = new ArrayList<>();

  void  inviteNextPatient(){
      if(patients.isEmpty()){
          System.out.println("Очередь пуста");
      }
      else{
          Patient first = patients.get(0);

          System.out.println("В кабинет приглашается: ["+first.name+"]");
          patients.remove(0);
      }

  }
}
