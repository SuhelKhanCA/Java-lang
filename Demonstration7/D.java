package Demonstration7;
public class D{
    protected int i = 55;
    void msg(){
        System.out.println("I m  in class D"+ i);
    }
}
class Simple{
    public static void main(String[] args) {
        D obj  = new D();
        obj.msg();
    }
}