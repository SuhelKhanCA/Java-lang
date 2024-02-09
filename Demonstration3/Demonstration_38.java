package Demonstration3;
// Java program to demonstrate working of constructor
class Circle{
    double x, y;
    double r;
    Circle(double a, double b, double c){ // constructor to initialize objects of Circle class
        x = a;
        y = b;
        r = c;
    }
    // Method that returns circumference
    double circumference(){
        return (2*3.14*r);
    }
    // Method that returns area
    double area(){
        return (3.14*r*r);
    }
}
public class Demonstration_38 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 4.0, 5.0);
        Circle c2 = new Circle(-4.0, 8.0, 10.0);

        System.out.println("Circumference for first circle : " + c1.circumference());
        System.out.println("Area for the first circle : " + c1.area());
        System.out.println();
        System.out.println("Circumference for the first circle : " + c2.circumference());
        System.out.println("Area for the first circle : " + c2.area());
    }
}
