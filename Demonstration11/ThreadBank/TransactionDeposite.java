package ThreadBank;

public class TransactionDeposite implements Runnable { // to implement a thread for deposit
    Account accountX;
    int amount;
    TransactionDeposite(Account x, int amount){ // Constructor to initiate this thread
        accountX = x;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        accountX.deposite(amount);
    }
}
