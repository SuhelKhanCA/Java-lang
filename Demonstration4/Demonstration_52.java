package Demonstration4;

public class Demonstration_52 { // printing 10 even numbers using (2n)
    public static void main(String[] args) {
        int count = 1;
        System.out.println("---Printing first 10 even numbers---");
        do{
            System.out.print(" " + (2*count));
            count++;
        }while (count < 11);
    }
}
