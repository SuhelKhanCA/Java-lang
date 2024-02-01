package Thread2;

public class ThreadZ implements Runnable {
    public void run(){
       for (int k = 0; k <= 5; k++) {
        System.out.println("Thread Z with k = "+ (2*k - 1));
       }
       System.out.println("Exiting Thread Y ...");
    }
}
