public class PremiumAccount extends BankAccount{
    PremiumAccount(String owner,double balance){
        super(owner, balance);
    }
    void payForServices(double price){
        internalTransfer(price);
    }
}
