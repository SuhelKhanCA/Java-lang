package Demonstration3;

// Defining a class with method to set instance variable
class Point{
    int x, y;
    void setPoint(int a, int b){ // stters to initialize the instance variable for a objects
        x = a;
        y = b;
    }
}
public class Demonstration_36 {
    public static void main(String[] args) {
        
        Point p = new Point(); // an object of class point
        p.setPoint(15, 20);
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    }
}
