import java.util.ArrayList;
import java.util.List;

public class SmartCart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public double calculateTotalCheck(boolean hasDiscountCard) {
        double total = 0;
        for (Item item : items) {
            int itemDiscountPercents = getItemDiscountPercents(item);
            double itemDiscount = item.getPrice() * itemDiscountPercents / 100;
            double itemPriceWithDiscount = item.getPrice() - itemDiscount;
            total = total + itemPriceWithDiscount;

            System.out.println("Товар: "+item.getName()+" стоил до: "+item.getPrice()+",после скидки: "+itemPriceWithDiscount);
        }

        if (total > 5000 && hasDiscountCard) {
            int dopDiscount = 7;
            double totalDiscount = total * dopDiscount / 100;
            total = total - totalDiscount;


        }
        return total;

    }

    private static int getItemDiscountPercents(Item item) {
        int itemDiscountPercents;
        if (item.getCategory() == Category.FOOD) {
            itemDiscountPercents = 5;
        } else if (item.getCategory() == Category.CLOTHES) {
            itemDiscountPercents = 10;
        } else {
            itemDiscountPercents = 0;
        }
        return itemDiscountPercents;
    }
}
