package Demonstration6b;
abstract class Base{
    abstract void fun();
}
class Derived extends Base{

    @Override
    void fun() {
       System.out.println("Derived fun() is called...!");
    }
    
}

public class Demonatration_68 {
    public static void main(String[] args) {
        // Base b = new Base(); //Error - can't instanciate
        Base b2 = new Derived(); // we can have reference of base type
        b2.fun();
    }
}
