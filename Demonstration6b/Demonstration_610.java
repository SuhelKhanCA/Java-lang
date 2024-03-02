package Demonstration6b;
abstract class Base{ // abtract class without any abstract method
    void fun(){
        System.out.println("Base class fun() is called...!");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor is called......!");
    }
    @Override
    void fun() {
       System.out.println("Derived fun() is called...!");
    }
    
}

public class Demonstration_610 {
    public static void main(String[] args) {
        
        Derived b2 = new Derived(); 
        b2.fun();
    }
}
