package Demonstration3;

public class A { // special use of 'this' keyword -- no object creation to invoke method
    // int x;
    A(){
        this(5);
        System.out.println("Hello A");
    }
    A(int x){
        System.out.println(x);
    }
}
