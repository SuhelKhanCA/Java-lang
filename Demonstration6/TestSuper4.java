package Demonstration6;
class Point2D{
    double x, y;
    Point2D(){ // default initialization
        x = 0;
        y = 0;
    }
    Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "x = " + this.x + "----" + "y = "+ this.y;
    }
}
class Point3D extends Point2D{
    double z;
    Point3D(){ // default initialization
        super();
        z = 0;
    }
    Point3D(double x , double y , double z){ 
        super(x, y);
        this.z= z;
    }
    @Override
    public String toString(){
        return "x = " + this.x + "----" + "y = "+ this.y + "---" + "z = " + this.z;
    }
}
public class TestSuper4 {
    public static void main(String[] args) {
        Point2D obj2D1 = new Point2D();
        Point2D obj2D2 = new Point2D(2.0, 2.5);
        System.out.println(obj2D1.toString());
        System.out.println(obj2D2.toString());

        Point3D obj3D1 = new Point3D();
        Point3D obj3D2 = new Point3D(4.5, 2.0, 6.0);
        System.out.println(obj3D1.toString());
        System.out.println(obj3D2.toString());
    }
}
