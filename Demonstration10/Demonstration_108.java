package Demonstration10;

public class Demonstration_108 {
    public static int j;
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            try {
                switch (i) {
                    case 0:
                        int zero = 0;
                        j = 999/zero; // Divide by zero
                        break;
                    case 1:
                        int b[] = null;
                        j = b[0]; // Null pointer error
                        break;
                    case 2:
                        int c[] = new int[2];
                        j = c[10]; // arrray index out of bound
                        break;
                    case 3:
                        char ch = "Java".charAt(9); // String index out of bound
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("In test case : #" + i);
                System.out.println(e.getMessage());
            }
        }
    }
}
