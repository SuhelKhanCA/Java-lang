package Thread1;
public class ThreadC extends Thread{
    public void run(){
        for (int k = 0; k <= 5; k++) {
            System.out.println("From the Thread-C with k = " + (2*k - 1));
        }
        System.out.println("Exiting from Thread C ... ");
    }
}