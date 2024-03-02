package Demonstration10;

public class Demonstration_105 {
    public static void main(String[] args) {
        int number, validCount = 0, invalidCount = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                // TODO: handle exception
                invalidCount++;
                System.out.println("Invalid count at: " + i);
            }
            validCount++;
            System.out.println("Valid count at: " + i);
        }
        System.out.println("Valid entries:" + validCount);
        System.out.println("Invalid entries:" + invalidCount);
    }
}
