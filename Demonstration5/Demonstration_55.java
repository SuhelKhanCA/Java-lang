package Demonstration5;

public class Demonstration_55 { // loop example with break
    public static void main(String[] args) {
        for (int i = 1;  ; i++) {
            if (i % 10 == 0) { // terminate the loop if ..
                break;
            }
            System.out.println("Loop complete: " + i);
        }
    }
}
