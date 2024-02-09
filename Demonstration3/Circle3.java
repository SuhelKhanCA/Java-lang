package Demonstration3;

public class Circle3 { // use of this in various way in the constructor. NOTE: 'this' should appear only as the first statement in a consttructor
    double x, y;
    double r;
    Circle3(double x, double y, double r){
        this.x = x; this.y = y; this.r = r;
    }
    Circle3(double r){
        this(0.0, 0.0, r);
    }
    Circle3(Circle3 c){
        this(c.x, c.y, c.r);
    }
    Circle3(){
        this(0, 0, 1.0);
    }
}
