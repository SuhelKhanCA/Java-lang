package Thread1;
public class ThreadB extends Thread{
    public void run(){
        for (int j = 0; j <= 5; j++) {
            System.out.println("From the Thread-B with j = " + (2*j));
        }
        System.out.println("Exitng from Thread B ... ");
    }
}