package Demonstration6a;

class A{
    int i, j;
    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k : " + (i+j+k));
    }
}
public class Demonstration_61 {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();

        // the super class may be used by itself.
        superObj.i = 10;
        superObj.j = 20;
        System.out.print("Contents of superObj:");
        superObj.showij();

        // the subclasss has access to all the public members of its parent class
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.print("Contents of subObj: ");
        subObj.showij();
        subObj.showk();
        System.out.println();
        System.out.print("Sum of i, j, k is: ");
        subObj.sum();
    }
}
