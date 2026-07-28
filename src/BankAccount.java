public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }
    protected void internalTransfer(double amount){
        balance = balance-amount;
        System.out.println("Внутренний перевод выполнен на сумму: " + amount);
    }
}
