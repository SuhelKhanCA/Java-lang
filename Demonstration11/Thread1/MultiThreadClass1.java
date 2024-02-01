package Thread1;

public class MultiThreadClass1 extends Thread{ // Creating thread with the 'Thread' class
    public static void main(String[] args) {
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    ThreadC c = new ThreadC();
    
    // Starting all the thread objects
    a.start();
    b.start();
    c.start();

    System.out.println("... Multithreading is over.");
    }
}