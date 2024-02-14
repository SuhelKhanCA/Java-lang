package Demonstration5;

public class Circle3 {
    double x,y,r;
    public Circle3(double r){
        this.x = 0;
        this.y = 0;
        this.r = r;
    }
    public Circle3 bigger(Circle3 c){ // instance method
        if(c.r > r){
            return c;
        }else{
            return this;
        }
    }
    public static Circle3 bigger(Circle3 a, Circle3 b){
        if (a.r > b.r) {
            return a;
        } else {
            return b;
        }
    }

    // main method
    public static void main(String[] args) {
        Circle3 a = new Circle3(2.0);
        Circle3 b = new Circle3(3.0);
        Circle3 c = a.bigger(b); // call of the instance method
        Circle3 d = Circle3.bigger(a, b); // call of the class method
        System.out.println("Circle c: " + c); // O/P: Circle c: Demonstration5.Circle3@4c3e4790
        System.out.println("Circle d :" + d); // o/p: Circle d :Demonstration5.Circle3@4c3e4790
    }
}
