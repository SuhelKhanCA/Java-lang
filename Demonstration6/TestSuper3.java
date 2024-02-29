package Demonstration6;
class Animal{
    // String color = "White";
    Animal(){
        System.out.println("Animal is created....!");
    }
}
class Dog extends Animal{
    // String color = "Black";
    Dog(){
        super();
        System.out.println("Dog is created...!");
    }
    // void printColor(){
    //     System.out.println(color);
    //     System.out.println(super.color);
    // }
}
public class TestSuper3 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
