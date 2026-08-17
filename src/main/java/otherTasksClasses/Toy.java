package otherTasksClasses;

import java.util.List;

public class Toy {
    String type;
    Toy(String type){
        this.type = type;
    }
    static void findToy(List<Toy> box, String searchName){
        for (Toy toy:box){
          if(toy.type.equals(searchName)){
              System.out.println("Игрушка ["+searchName+"] найдена в коробке!");
              return;
          }
        }
        System.out.println("Такой игрушки здесь нет");
    }
}
