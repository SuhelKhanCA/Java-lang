package Thread2;

public class MultiThreadRunnable1 { // Multithreading With the 'Runnable' interface 
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);
        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);
        Thread t3 = new Thread(new ThreadZ());

        // Start the thread
        t1.start();
        t2.start();
        t3.start();

        System.out.println("... Multithreading is over.");
    }
}
