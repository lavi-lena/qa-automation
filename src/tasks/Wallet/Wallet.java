package tasks.Wallet;

public class Wallet {
private     double balance = 500.0;

public Wallet(double balance){
    this.balance= balance;
}

    public double getBalance() {
        return balance;
    }

    public void buyItem(double price){
    if (price < 0){
        throw new IllegalArgumentException("Цена товара не может быть отрицательной!");
    }
    if (price > balance){
        throw new InsufficientFundsException("Недостаточно денег на балансе!");
    }
    }


}
