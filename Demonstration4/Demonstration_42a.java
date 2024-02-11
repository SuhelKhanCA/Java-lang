package Demonstration4;

public class Demonstration_42a {
    public static void main(String[] args) { // program to illustrate the use of printf() and formatting in it
        int x = 100;
        System.out.printf("Printing simple Integer: x = %d\n" , x);
        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precision : PI = %.2f\n", Math.PI);

        float n = 5.2f;
        // automatically appends zero to the rightmost part of the decimal
        System.out.printf("Formatted to the specific width: n = %.4f\n", n);
        n = 25233652.3f;
        // here number is formatted from right margin and occupies a width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);
    }
}
