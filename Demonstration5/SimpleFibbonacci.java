package Demonstration5;

public class SimpleFibbonacci { // bug
    int n;
    public static void main(String[] args) {
        SimpleFibbonacci obj = new SimpleFibbonacci();
        obj.n = Integer.parseInt(args[0]);
        int fibo1 = 0; int fibo2 =1;
        System.out.print(fibo1 + " " + fibo2);
        int count = 2; // count of numbers printed
        while (count < obj.n) {
            int fibo = fibo1 + fibo2;
            System.out.print(" " + fibo);
            fibo1 = fibo2; fibo2 = fibo;
            count++;
        }
    }
}
