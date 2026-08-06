package tasks.DebtCheck;

import java.util.ArrayList;
import java.util.List;

public class Resident {
    private String houseNumber;
    private boolean hasDebt;

    public Resident(String houseNumber, boolean hasDebt) {
        this.houseNumber = houseNumber;
        this.hasDebt = hasDebt;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public boolean getHasDebt() {
        return hasDebt;
    }

    public static boolean isStreetClean(List<Resident> street) {
        return street.stream()
                .noneMatch(r -> r.getHasDebt());
    }
    public static void debtCheck(){
        List<Resident> check1 = new ArrayList<>();
        check1.add(new Resident("1", false));
        check1.add(new Resident("2", false));
        check1.add(new Resident("3", false));

        List<Resident> check2 = new ArrayList<>();
        check2.add(new Resident("4",false));
        check2.add(new Resident("5",true));
        check2.add(new Resident("6",false));


        boolean check2Result =   Resident.isStreetClean(check2);

        System.out.println("Должники отсутствуют? "+Resident.isStreetClean(check1));
        System.out.println("Должники отсутствуют? "+check2Result);
    }
}
