package Demonstration5;

public class RecursiveFactorial {
    int n;
    int facto(int n){
        if (n==0) {
            return 1;
        }else{
            return (n*facto(n-1));
        }
    }
    public static void main(String[] args) {
        RecursiveFactorial x = new RecursiveFactorial();
        x.n = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + x.n + ": " + x.facto(x.n));
    }
}
