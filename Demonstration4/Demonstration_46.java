package Demonstration4;

import java.util.Scanner;

public class Demonstration_46 { //  program to show how to read and write to console
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double area = 2*3.14*radius;
        System.out.println("Area is: " + area);
    }
}
