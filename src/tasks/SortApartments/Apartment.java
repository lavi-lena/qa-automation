package tasks.SortApartments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartment {
    private int rooms;
    private int pricePerNight;

    public Apartment(int rooms,int pricePerNight){
        this.rooms = rooms;
        this.pricePerNight = pricePerNight;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }
    public static void sortApartments(){
        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.add(new Apartment(2, 1500));
        apartmentList.add(new Apartment(3, 5500));
        apartmentList.add(new Apartment(2,3500));

        List<Apartment> sortedApartments = apartmentList.stream()
                .sorted(Comparator.comparing((Apartment app)->app.getPricePerNight()).reversed())
                .toList();

        List<Integer> sortedApartmentPrices = sortedApartments.stream().map(app->app.getPricePerNight()).toList();
        System.out.println(sortedApartmentPrices);
    }
}
