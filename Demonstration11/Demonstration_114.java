/* using getID() method */
package Demonstration11;
class ThreadID extends Thread{ // extending 'Thread' class
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
public class Demonstration_114 {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < 8; i++) {
            ThreadID object = new ThreadID();
            object.start();;
        }
    }
}
