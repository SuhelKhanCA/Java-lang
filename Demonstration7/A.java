package Demonstration7;

public class A {
    private int data = 40;
    public void msg(){
        System.out.println("Class A: Hello World Java !");
    }
}
class B{
    public static void main(String[] args) {
        A obj = new A(); // OK : class is public
        // System.out.println(obj.data);  // Compile time error : data is private
        obj.msg(); // Ok : msg is public
    }
}
