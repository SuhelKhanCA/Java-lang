package Demonstration5;

public class Circle2 {
    static int circleCount = 0; // class variable
    public double x, y, r; // instance variable

    public Circle2(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount++;
    }
    public Circle2(double r){
        this(0.0, 0.0, r);
        circleCount++;
    }
    public Circle2(Circle2 c){
        this(c.x, c.y, c.r);
    }
    public Circle2(){
        this(0.0, 0.0, 1.0);
        circleCount++;
    }
    public double circumference(){
        return(2*3.14*r);
    }
    public double area(){
        return(3.14*r*r);
    }

    // main method
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(5.0);
        Circle2 c3 = new Circle2(c1);
        System.out.println("c1# :" + c1.circleCount + "-----c2# : " +c2.circleCount + "-----c3# : " + c3.circleCount);
    }
}
