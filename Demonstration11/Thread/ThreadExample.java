package Thread;

public class ThreadExample extends Thread { // Multithreaded program with exception try-catch block
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                sleep((int)(Math.random()*5000)); // 5s or ms
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        new ThreadExample().start();
        new ThreadExample().start();
        System.out.println("Done");
    }
}
