package tasks.ConcatNames;

import java.util.List;
import java.util.stream.Collectors;

public class Hiker {
    private String name;

    public Hiker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void ConcatNames(){
        List<Hiker> hikerList = List.of(
                new Hiker("Иван"),
                new Hiker("Мария"),
                new Hiker("Петр")
        );
        String allNames = hikerList.stream()
                .map(Hiker::getName)
                .collect(Collectors.joining(", ")); // Просто указываем разделитель

        System.out.println(allNames);
    }
}
