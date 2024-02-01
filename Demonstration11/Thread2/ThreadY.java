package Thread2;

public class ThreadY implements Runnable  {
    public void run(){
        for (int j = 0; j <= 5; j++) {
            System.out.println("Thread Y with j = " + (2*j));
        }
        System.out.println("Exiting from Thread Y ...");
    }
}
