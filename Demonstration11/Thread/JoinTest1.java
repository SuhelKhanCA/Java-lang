package Thread;
class R extends Thread{

}
public class JoinTest1{
    public static void main(String[] args){
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());

        t1.start();
        t2.start();

        try{
            t1.join(); // waits until t1 has terminated
            t2.join(); // Waits until t2 has terminated
        }
        catch(InterruptedException e){
            System.out.println("Done!");
        }
    }
}