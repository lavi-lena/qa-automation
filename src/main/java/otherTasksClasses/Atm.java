package otherTasksClasses;

public class Atm {
    int moneyAmount;

    Atm() {
        moneyAmount = 10000;
    }
        void withdrawMoney(int amount){
            if (amount<=moneyAmount) {
            moneyAmount =  moneyAmount-amount;
            System.out.println("Выдано: ["+amount+"] руб.");
            }
            else {
                System.out.println("В банкомате недостаточно денег!");
            }




    }
}
