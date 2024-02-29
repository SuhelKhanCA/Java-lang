package Demonstration6a;


class Box {
    double width;
    double height;
    double depth;

    Box() { // default value
        width = 0;
        height = 0;
        depth = 0;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double vol(){ // volume of the Box
        return width * height * depth;
    }
}
class BoxWeight extends Box{
    double weight; // weight of the box
    // default constructor of BoxWeight
    BoxWeight(){
        super();
        this.weight = 0;
    }
    // constructor for the box weight
    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); // call the overloaded method in the super class
        this.weight = weight;
    }
}
public class Demonstration_62b {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        BoxWeight myBox2 = new BoxWeight(1.2, 5, 3.8, .025);

        // System.out.println("Weight of my box2 is : " + myBox1.weight); // ERROR!
        double vol;
        vol = myBox1.vol(); // OK! because vol() is defined in the Box class
        System.out.println("Volume of my box1 is : " + vol);
        System.out.println();

        vol = myBox2.vol();
        System.out.println("Volume of my box2 is : " + vol);
        System.out.println("Weight of my box2 is : " + myBox2.weight);
    }
}
