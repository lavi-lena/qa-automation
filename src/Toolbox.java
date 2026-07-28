import java.util.ArrayList;
import java.util.List;

public class Toolbox {
    List<Tool> tools = new ArrayList<>();

    void countTools(){
        System.out.println("В ящике сейчас инструментов: ["+tools.size()+"]");
    }
}
