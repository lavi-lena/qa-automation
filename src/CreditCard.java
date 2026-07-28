public class CreditCard extends BankCard {
    CreditCard(String cardNumber, double balance) {
        super(cardNumber, balance);
    }

    @Override
    public void pay(double amount) {
        double newBalance = getBalance() - amount;
        setBalance(newBalance);


    }
}
