import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SmartCart smartCart = new SmartCart();
        Item item1 = new Item("tomato", 3.00, Category.FOOD);
        Item item2 = new Item("iphone", 2875.00, Category.ELECTRONICS);
        Item item3 = new Item("shirt", 2645.00, Category.CLOTHES);

        smartCart.addItem(item1);
        smartCart.addItem(item2);
        smartCart.addItem(item3);

      smartCart.calculateTotalCheck(false);
      smartCart.calculateTotalCheck(true);


    }
}