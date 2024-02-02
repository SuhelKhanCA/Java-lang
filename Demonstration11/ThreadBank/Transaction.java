package ThreadBank;

public class Transaction {
    public static void main(String[] args) {
        Account ABC = new Account(); // create an account
        ABC.balance = 1000; // initialize the amount by Rs 1000
        TransactionDeposite t1; // a thread for deposite
        TransactionWithdraw t2; // another thread for withdraw
        t1 = new TransactionDeposite(ABC, 500);
        t2 = new TransactionWithdraw(ABC, 900);
    }
}
