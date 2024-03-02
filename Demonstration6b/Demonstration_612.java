package Demonstration6b;
abstract class Base{
    final void fun(){
        System.out.println("Final fun() is called");
    }
}
class Derived extends Base{

}
public class Demonstration_612 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
