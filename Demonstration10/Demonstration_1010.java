package Demonstration10;

import java.util.Arrays;

public class Demonstration_1010 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                array[i] = i;
            }
            System.out.println(array);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fill in: " + e.fillInStackTrace());
            System.out.println("Fill in: " + e.getCause());
            System.out.println("Fill in: " + e.getLocalizedMessage());
            System.out.println("Fill in: " + e.getMessage());
            System.out.println("Fill in: " + e.getStackTrace());
            System.out.println(); e.printStackTrace();
            System.out.println();
            System.out.println();

            System.out.println("Oops, we went too far, better go back to 0!");
            throw(Exception) new Exception().initCause(e);
        }
        finally{
            System.out.println("Array: " + Arrays.toString(array));
        }
    }
}
