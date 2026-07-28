import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    List<Flower> flowers = new ArrayList<>();

    void hasFlower(String searchType){
        for (Flower cvet:flowers){
            if(  cvet.type.equals(searchType)){
                System.out.println("В букете есть ["+searchType+"]!");
                return;
            }
            System.out.println("Такого цветка в букете нет");
        }
    }
}
