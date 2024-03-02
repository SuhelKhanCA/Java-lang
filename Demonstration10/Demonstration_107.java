package Demonstration10;

public class Demonstration_107 {
    public static void main(String[] args) {
        try {
            int i = args.length; // No. of argument in the command line
            String[] myString = new String[i];
            // if i==0 then myString null pointer error
            if (myString[0].equals("Java")) { // #1
                System.out.println("First word is Java");
            }
            System.out.println("No. of arguments: " + i);
            int x = 12/i; // #2
            int[] y  = {555, 999}; // y is array having index 0 1
            y[i] = x; // #3 Index out of bound may occur if i > 1
        } catch (ArithmeticException e) { // catch #1
            // TODO: handle exception
            System.out.println("Divide by zero" + e);
        } catch(NullPointerException e){ // catch #2
            System.out.println("A null pointer exeception" + e);
        }catch(ArrayIndexOutOfBoundsException e){ // catch #3
            System.out.println("Array  index out of bound" + e);
        }
    }
}
