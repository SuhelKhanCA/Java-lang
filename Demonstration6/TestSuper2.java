package Demonstration6;
class Animal{
    void eat(){
        System.out.println("EATING....!");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...!");
    }
    void bark(){
        System.out.println("Dog is barking......!");
    }
    void work(){
        super.eat();
        bark();
        eat();
    }
}
public class TestSuper2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.work();
    }
}
