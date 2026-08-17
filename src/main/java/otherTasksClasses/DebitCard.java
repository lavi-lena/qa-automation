package otherTasksClasses;

public class DebitCard extends BankCard{
    DebitCard(String cardNumber, double balance) {
        super(cardNumber, balance);
    }

    @Override
    public void pay(double amount) {
        double newBalance= getBalance()-amount;
      if (newBalance<0){
          System.out.println("Отказ: недостаточно средств");

      }
      else{
          setBalance(newBalance);
      }
    }
}
