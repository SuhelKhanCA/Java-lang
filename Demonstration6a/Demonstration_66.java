package Demonstration6a;
class Cat{
    void speak(){
        System.out.println("Meonnn!");
    }
}
class PetCat extends Cat{
    @Override
    void speak(){
        System.out.println("Meonnnnnnnnnnn.......!");
    }
}
class MagicCat extends Cat{
    static boolean noOne;

    void speak(){
        if (noOne) {
            super.speak(); // use the super class definition
        } else{
            System.out.println("Hello world!");
        }
    }
}
public class Demonstration_66 {
    public static void main(String[] args) {
        PetCat c1 = new PetCat();
        MagicCat c2 = new MagicCat();
        c1.speak();
        MagicCat.noOne = true;
        c2.speak();
        MagicCat.noOne = false;
        c2.speak();
    }
}
