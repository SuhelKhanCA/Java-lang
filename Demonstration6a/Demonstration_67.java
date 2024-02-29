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
// adding the shipment class
class Shipment extends BoxWeight{
    double cost;

    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, cost); // call the overloaded method in the super class
        this.cost = cost;
    }
}
public class Demonstration_67 {
    public static void main(String[] args) {
        Shipment shpBox = new Shipment(1.2, 5, 3.8, .025, 5000);
        double vol;
        vol = shpBox.vol(); // OK! because vol() is defined in the Box class
        System.out.println("Volume of my shpBox is : " + vol);
        System.out.println();

        vol = shpBox.vol();
        System.out.println("Volume of my shpBox is : " + vol);
        System.out.println("Weight of my shpBox is : " + shpBox.weight);
    }
}
