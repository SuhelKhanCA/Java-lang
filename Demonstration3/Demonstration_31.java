package Demonstration3;
// A program that uses Circle class
class Circle{
    double x, y; // The coordinates of the center
    double r; // The radius
    // Method that returns circumference
    double circumference(){
        return (2*3.14*r);
    }
    // Method that returns area
    double area(){
        return (3.14*r*r);
    }
}
// The following class declares an object of type Circle
public class Demonstration_31 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;

        System.out.println("Circumference : " + c.circumference());
        System.out.println("Area : " + c.area());
    }
}
