package Demonstration6a;
class A{
    int i;
}
class B extends A{
    int i; // this hides the i in A

    B(int a, int b){
        super.i = i;
        i = b;
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class Demonstration_63 {
    public static void main(String[] args) {
        B subObj = new B(1, 3);
        subObj.show();
    }
}
