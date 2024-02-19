package Demonstration5;

public class SimpleFactorial {
    static int n;
    public static void main(String[] args) {
        int fact = 1;
        n = Integer.parseInt(args[0]);
        if ((n==0) || (n==1)) {
            System.out.println("Factorial of  " + n + ": " + fact);
            return;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact *i;
        }
        System.out.println("Factorial of " + n + ": " + fact);
        return;
    }
}
