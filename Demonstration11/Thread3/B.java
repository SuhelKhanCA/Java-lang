package Thread3;

public class B extends Thread {
    public void run(){
        System.out.println("Thread B started");
        for (int j = 0; j <= 4; j++) {
            System.out.println("\t From Thread-B: j = "+ (++j));
        }
        System.out.println("Exit from B");
    }
}
