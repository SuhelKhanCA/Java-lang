package Thread3;

public class C extends Thread {
    public void run(){
        System.out.println("Thread C started");
        for (int k = 0; k <= 4; k++) {
            System.out.println("\t From Thread-C: k = "+ (++k));
        }
        System.out.println("Exit from C");
    }
}
