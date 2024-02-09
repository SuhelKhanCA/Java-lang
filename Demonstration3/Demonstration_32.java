package Demonstration3;

// A program that declares two objects of the circle class

class Circle{
    double x, y;
    double r;

    double circumference(){
        return (2*3.14*r);
    }
    double area(){
        return (3.14*r*r);
    }
}

// The following class declares the two objects of circle class
public class Demonstration_32 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        // Initialize the circle
        c1.x = 3.0;
        c1.y = 4.0;
        c1.r = 5.0;

        c2.x = -4.0;
        c2.y = -8.0;
        c2.r = 10.0;

        System.out.println("Circumference for first circle : " + c1.circumference());
        System.out.println("Area for the first circle : " + c1.area());
        System.out.println();
        System.out.println("Circumference for the first circle : " + c2.circumference());
        System.out.println("Area for the first circle : " + c2.area());
    }
}
