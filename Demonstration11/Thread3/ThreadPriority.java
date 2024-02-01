package Thread3;
public class ThreadPriority{ // Thread with priority program
    public static void main(String[] args) {
        A tA = new A();
        B tB = new B();
        C tC = new C();

        tA.setPriority(Thread.MAX_PRIORITY);
        tB.setPriority(Thread.NORM_PRIORITY);
        tC.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Started Thread A");
            tA.start();
        System.out.println("Started Thread B");
            tB.start();
        System.out.println("Started Thread C");
            tC.start();
    }
}