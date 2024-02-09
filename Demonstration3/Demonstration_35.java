package Demonstration3;

// Defining a class with method to set instance variable
class Point{
    int x, y;
    void setPoint(){ // setter to set default value to a variable
        x = 10;
        y = 20;
    }
}
public class Demonstration_35 {
    public static void main(String[] args) {
        
        Point p = new Point(); // an object of class point
        p.setPoint();
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    }
}
