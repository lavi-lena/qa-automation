import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    String model;
    int waterMl = 500;
    int milkMl = 300;
    List<CoffeeType> history = new ArrayList<>();

    CoffeeMachine(String model) {
        this.model = model;
    }

    private void heatWater() {
        System.out.println("Подогрев воды...");
    }

    private void pourMilk() {
        milkMl = milkMl - 100;
        System.out.println("Добавление молока...");
    }

    private void logOrder(CoffeeType type) {
        history.add(type);
    }

    void makeCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO -> {
                heatWater();
                logOrder(type);
            }
            case LATTE -> {
                heatWater();
                pourMilk();
                logOrder(type);
            }
        }
    }

}
