package Thread2;

public class ThreadX implements Runnable {
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread X with i = " + (-1*i));
        }
        System.out.println("Exiting from thread-X ....");
    }
}
