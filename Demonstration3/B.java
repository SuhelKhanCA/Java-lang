package Demonstration3;

public class B { // use of 'this' : to invoke current class method
    void m(){
        System.out.println("Hello m().");
    }
    void n(){
        System.out.println("Hello n().");
        this.m();
    }
}
