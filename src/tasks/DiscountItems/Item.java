package tasks.DiscountItems;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private double price;

    public Item(String name,double price){
        this.name = name;
        this.price= price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public static void discountItems(){
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("tomato", 4));
        itemList.add(new Item("tea", 6));
        itemList.add(new Item("onion", 5));

        List<Item> itemsWithDiscount = itemList.stream()
                .map(item -> new Item(item.getName(), item.getPrice() * 0.8))
                .toList();
        List<Double> discountPrices = itemsWithDiscount.stream()
                .map(item -> item.getPrice())
                .toList();
        System.out.println("Стоимость товаров со скидкой: "+discountPrices);
    }
}
