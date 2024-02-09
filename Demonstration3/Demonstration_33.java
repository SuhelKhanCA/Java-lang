package Demonstration3;

public class Demonstration_33 {
    public static void main(String[] args) {
        Circle c = new Circle(); // Declaring the objects of the circle class
        Box b = new Box(); // Declaring the object of the Box class
        
        // Initialize th objects
        c.x = 3.0;
        c.y = 4.0;
        c.r = 6.0;

        b.width = 3.0;
        b.height = 4.0;
        b.depth = 5.0;

        System.out.println("Circumference for circle : " + c.circumference());
        System.out.println("Area  for circle: " + c.area());

        System.out.println("Volume for box : " + b.volume());
        System.out.println("Area for box : " + b.area());
    }
}
