package Demonstration6;

public class Bike {
    void run(){
        System.out.println("Running.......!");
    }
}
class Splendor extends Bike{
    void run(){
        System.out.println("Running safely with 60kmph.....!");
    }
    public static void main(String[] args) {
        Splendor b1 = new Splendor();
        b1.run();
        Bike b2 = new Bike();
        b2.run();
        Bike b3 = new Splendor(); // up-casting
        b3.run();
    }
}
