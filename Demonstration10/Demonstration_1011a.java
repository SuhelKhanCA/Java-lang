package Demonstration10;

public class Demonstration_1011a {
    public static void main(String[] args) {
        try {
            // to catch divide-by-xero
            int a = args.length;
            int b = 42/a; // divide by zero erro
            System.out.println("a = " + a);
            if (a==1) {
                a = a/ (a-a); // anothe divide-by-zero error
            }
            try {
                // nested try block
                if (a==2) {
                    // if two CLI args used, out-of-bound
                    int c[] = {1};
                    c[2] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero : " + e);
        }
    }
}
