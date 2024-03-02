package Demonstration10;
import java.io.*;
// exception class
class InsufficientFundsExcepption extends Exception{
    private double amount;
    public InsufficientFundsExcepption(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
// checking class
class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withDraw(double amount) throws InsufficientFundsExcepption{
        if (amount <= balance) {
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw new InsufficientFundsExcepption(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
// demo class
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $ 500...!");
        c.deposit(500.0);
        try{
            System.out.println("Withdrawing $100 ...!");
            c.withDraw(100.0);
            System.out.println("Withdrawing $600....!");
            c.withDraw(600);
        }catch(InsufficientFundsExcepption e){
            System.out.println("Sorry but you are short $ " + e.getAmount());
            e.printStackTrace();
        }
    }
}
