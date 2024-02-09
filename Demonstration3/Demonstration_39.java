package Demonstration3;
/*  Demonstration of constructor overloading */
class Circle2{
    double x, y;
    double r;
    // Parametrized
    Circle2(double a, double b, double c){ // constructor to initialize objects of Circle class
        x = a;
        y = b;
        r = c;
    }
    Circle2(double c){ // only initalize the radius and remaining are 'null'
        r = c;
    }
    Circle2(Circle2 cr){ // copy constructor
        x = cr.x;
        y = cr.y;
        r = cr.r;
    }
    Circle2(){ // default constructor
        x = 0.0;
        y = 0.0;
        r = 1.0;
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
public class Demonstration_39 {
    public static void main(String[] args) {
        // creating objects of the above circle class
        Circle2 c1 = new Circle2(3.0, 4.0, 5.0);
        Circle2 c2 = new Circle2(5.0);
        Circle2 c3 = new Circle2(c1);
        Circle2 c4 = new Circle2();

        System.out.println("Circumference Circle-1 : " + c1.circumference());
        System.out.println("Area  Circle-1: " + c1.area());
        System.out.println("Circumference Circle-2 : " + c2.circumference());
        System.out.println("Area  Circle-2: " + c2.area());
        System.out.println("Circumference Circle-3 : " + c3.circumference());
        System.out.println("Area  Circle-3: " + c3.area());
        System.out.println("Circumference Circle-4 : " + c4.circumference());
        System.out.println("Area  Circle-4: " + c4.area());
    }
}
