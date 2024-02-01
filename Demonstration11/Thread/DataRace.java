package Thread;

public class DataRace extends Thread { // Data race condition
static int x;
    public void run(){
        for (int i = 0; i < 100000; i++) {
            x = x - 1;
            x = x + 1;
        }
    }
    public static void main(String[] args) {
        x = 0;
        for (int i = 0; i < 100000; i++) {
            new DataRace().start();
        System.out.println(x); // x is not always 0!
        }
    }
}
