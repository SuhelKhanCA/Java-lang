package Demonstration4;

import java.util.Scanner;

public class Demonstration_45 { // program to take input through Scanner class object
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner class object to take input
        // calculating the maximum of two numbers in Java
        System.out.println("Pleasse enter two numbers to find maximum: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.printf("Between %d and %d , maximum is: %d \n", a, b, a);

        }else{
            System.out.printf("Between %d and %d , maximum is: %d \n", a, b, b);
        }
    }
}
