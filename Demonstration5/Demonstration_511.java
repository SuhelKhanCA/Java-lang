package Demonstration5;

public class Demonstration_511 {
    public static void main(String[] args) {
        int x;
        x =10;
        if (x == 10) {
            int y = 20;
            System.out.println("x and y : " + x + " " + y);
            x = y*2;
        }
        // y = 100;  // Error - out of scope
        System.out.println("x is : "+ x);
    }
}
