package Demonstration10;

import java.util.Scanner;

public class MaximumOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two number: ");
        int a =  in.nextInt();
        int b = in.nextInt();
        if (a> b) {
            System.out.println("Between " + a +" and "+ b+ ": " + a + " is max...!" );
        } else {
            System.out.println("Between " + a +" and "+ b+ ": " + b + " is max...!" );
        }
    }
}
