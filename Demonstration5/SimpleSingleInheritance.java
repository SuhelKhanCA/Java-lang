package Demonstration5;

class Point2D{
    int x;
    int y;
    void display(){
        System.out.println("x= " + x + "y= " + y);
    }
}
class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println("x= " + x+ "y= " + "z= " + z);
    }
}
public class SimpleSingleInheritance {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.x = 10;
        p1.y = 20;
        p1.display();

        p2.x = 1;
        p2.y = 2;
        p2.z = 3;
        p2.display();
    }
}
