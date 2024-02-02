package ThreadBank;

public class Account {
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account No: " + accountNo + " Balance: " + balance);
    }
    synchronized void deposite(int amount){
        // method to deposit an amount
        balance = balance + amount;
        System.out.print(amount + " is deposited!");
        displayBalance();
    }
    synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.print(amount + " is withdrawn!");
        displayBalance();
    }
}
