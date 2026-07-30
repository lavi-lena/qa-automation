import tasks.Wallet.InsufficientFundsException;
import tasks.Wallet.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(50);
        try {
            wallet.buyItem(-23);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            wallet.buyItem(69);
        } catch (InsufficientFundsException s){
            System.out.println("Мы словили ошибку: "+s.getMessage());

        }
    }
}
