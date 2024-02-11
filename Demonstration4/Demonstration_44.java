package Demonstration4;

public class Demonstration_44 { // program to chck for CLI inputs
    public static void main(String[] args) {
        // check if length of args array is greater than 0
        if (args.length > 0) {
            System.out.println("The CLI inputs are: ");
            // iterating and printing 
            for (String str : args) {
                System.out.println(str);
            }
        }else{
            System.out.println("No CLI inputs are found");
        }
    }
}
