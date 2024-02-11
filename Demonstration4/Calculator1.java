package Demonstration4;

public class Calculator1 {
    double i;
    double  x = Math.sqrt(i);
}
class Example2{
    public static void main(String[] args) {
        Calculator1 a = new Calculator1();
        a.i = Double.parseDouble(args[0]);
        System.out.println("Square root of " + a.i + " is " + a.x);
    }
}