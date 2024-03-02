package Demonstration10;

public class Demonstration_109 {
    public static void main(String[] args) {
        int i = 0;
        String greeting[] = {"Hello twinkle", "Hello Java", "Hello word"};
        while (i < 4) {
            try{
                System.out.println(greeting[i]);
                i++;
            }catch(Exception e){
                System.out.println(e.toString()); // message of the exception in the string format
            }
            finally{
                System.out.println("Hi!");
                if (i < 3); else {
                    System.out.println("You should quit and reset index value"); break;
                }
            }
        } // while loop
    }
}
