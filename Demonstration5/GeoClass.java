package Demonstration5;
class Box{ 
    float x = 10.0f;
    float y = 20.0f;
    float w = 15.0f;
    float area(){
        return (2*(x*y + y*w +w*x));
    }
}
class Circle{
    float x = 0.0f;
    float y = 0.0f;
    float r = 5.0f;
    float area(){
        return (float) (3.14*r*r);
    }
}
public class GeoClass {
    static float x = 50.0f;
    float y = 60.0f;
    public static void main(String[] args) { // scope rule
        Box b = new Box();
        Circle c = new Circle();
        
        System.out.println("GeoClass data: x = " + x);
        System.out.println("Box data: x = " + b.x);
        System.out.println("Box area: " + b.area());
        System.out.println("Circle Data: x = " + c.x);
        System.out.println("Circle area: " +  c.area());
    }
}
