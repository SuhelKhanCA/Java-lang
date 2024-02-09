package Demonstration3;

public class Box {
    double width;
    double height;
    double depth;
    // The following method returns the area of the box
    double area(){
        double a;
        a = (width*height + height*depth + width*depth);
        return a;
    }
    // the following method returns the volume of the box
    double volume(){
        double v;
        v = width*height*depth;
        return v;
    }
}
