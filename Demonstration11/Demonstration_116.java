/* use of suspend() and resume() methods */
package Demonstration11;
class Thread1 extends Thread{
    public void run(){
       try {
        System.out.println("First thread is running");
        sleep(1000);
        System.out.println("First thread finishes running.");
       } catch (Exception e) {
        // TODO: handle exception
       }

    }
}
class Thread2 extends Thread{
    public void run(){
       try {
        System.out.println("Second thread starts running");
        System.out.println("Second thread is suspended itself.");
        suspend();
        System.out.println("Second thread runs again.");
       } catch (Exception e) {
        // TODO: handle exception
       }

    }
}
public class Demonstration_116 {
    public static void main(String[] args) {
        try {
            Thread1 first = new Thread1();
            Thread2 second  = new Thread2();

            first.start();
            second.start();

            System.out.println("Revive the second.");
            second.resume();

            System.out.println("Second thread wait for 10 seconds sleep");
            second.sleep(1000);
            System.out.println("Wake up second thread");
            second.resume();
            System.out.println("Second thread finishes running.");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
