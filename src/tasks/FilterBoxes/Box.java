package tasks.FilterBoxes;

import java.util.ArrayList;
import java.util.List;

public class Box {
   private boolean isEmpty;

   public Box(boolean isEmpty){
       this.isEmpty = isEmpty;
   }

    public boolean getIsEmpty() {
        return isEmpty;
    }
    public static void filterBoxes(){
        List<Box> boxList = new ArrayList<>();
        boxList.add(new Box(true));
        boxList.add(new Box(true));
        boxList.add(new Box(false));

        long isEmptyCount = boxList.stream()
                .filter(box -> box.getIsEmpty())
                .count();
        System.out.println("Пустых коробок: " + isEmptyCount);

        List<Box> empytBoxes = boxList.stream()
                .filter(box -> box.getIsEmpty())
                .toList();
        System.out.println(empytBoxes);



    }



}
