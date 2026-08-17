package otherTasksClasses;

abstract class BankCard{
    private String cardNumber;
    private double balance;

    BankCard(String cardNumber,double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
    }
    public abstract void pay(double amount);
}
