package Demonstration6b;
abstract class Base{
    Base(){System.out.println("Base class constructor is called...!");}
    abstract void fun();
}
class Derived extends Base{
    Derived(){
        super();
        System.out.println("Derived constructor is called......!");
    }
    @Override
    void fun() {
       System.out.println("Derived fun() is called...!");
    }
    
}

public class Demonstration_69 {
    public static void main(String[] args) {
        
        Derived b2 = new Derived(); 
        b2.fun();
    }
}
