package Demonstration5;

public class Demonstration_58 {
    public static void main(String[] args) {
        {
            // The variable x has scope within this bracket only
            int x = 10;
            System.out.println(x);
        }
        // Uncommenting below line of code will priduce error since variable x is out of scope
        // System.out.println(x); 
    }
}
