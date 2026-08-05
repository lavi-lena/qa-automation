package tasks.FindUniqueCities;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public static void findUniqueCities() {
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("Москва", "Арбат"));
        addressList.add(new Address("Москва", "Тверская"));
        addressList.add(new Address("Минск", "Партизанская"));
        addressList.add(new Address("Тюмень", "Ленина"));

        List<String> cityList = addressList.stream()
                .map(address -> address.getCity())
                .distinct()
                .toList();
        System.out.println(cityList);
    }
}
