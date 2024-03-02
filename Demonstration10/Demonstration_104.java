package Demonstration10;

public class Demonstration_104 {
    static int anyFunction(int a, int b){
        try {
            int x = a/b;
            return x;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Divide by zero exception" + e.getMessage());
        }
        return 0 ;
    }
    public static void main(String[] args) {
        int a,b , result;
        a = 0;
        b= 0;
        try {
             a = Integer.parseInt(args[0]);
             b = Integer.parseInt(args[1]);
             System.out.println("Value of a and b" +a + "---" + b);
        } catch (Exception e) {
            // TODO: handle exception
            result = anyFunction(a, b);
            System.out.println("\nResult:" + result);
        }
    }
}
