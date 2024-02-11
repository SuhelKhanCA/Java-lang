package Demonstration5;

public class Demonstration_51 { // printing 10 odd numbers using (2n -1)
    public static void main(String[] args) {
        int count = 1;
        System.out.println("---Printing first 10 odd numbers---");
        while (count < 11) {
            System.out.print(" " + (2*count - 1));
            count++;
        }
    }
}
