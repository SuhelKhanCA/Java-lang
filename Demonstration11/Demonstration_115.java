/* using getID() method */
package Demonstration11;
class ThreadID2 extends Thread{ // implementing 'Runnable' interface
    public void run(){
        try {
            // dispalying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running...");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception is caught...!");
        }
    }
}
public class Demonstration_115 {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < 8; i++) {
            ThreadID2 object = new ThreadID2();
            object.start();;
        }
    }
}
