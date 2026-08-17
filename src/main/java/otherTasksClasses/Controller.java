package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Scannable> checkedTickets = new ArrayList<>();

   void check(Scannable t){
       t.scan();
       checkedTickets.add(t);
   }
}
