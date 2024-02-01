package Thread1;
public class ThreadA extends Thread{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("From the thread-A with i = " + (-1*i));
        }
        System.out.println("Exiting from ThreadA ...");
    }
}