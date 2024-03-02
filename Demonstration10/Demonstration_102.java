package Demonstration10;
// showing runtime error in the program
public class Demonstration_102 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a/b;
        System.out.println("Value of c: " + c);
    }
}
/*
 * NOTE:
 * if we give b input as 0: ==>> java.lang.ArithmeticException: / by zero
 */
