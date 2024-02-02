package ThreadBank;

public class TransactionWithdraw implements Runnable { // to implement a thread to withdraw
    Account accountY;
    int amount;
    TransactionWithdraw(Account y, int amount){ // Constructor to initiate this thread
        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}
