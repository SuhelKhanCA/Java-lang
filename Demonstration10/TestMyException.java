package Demonstration10;

class MyExeption extends Exception{
    MyExeption(String msg){
        super(msg);
    }
}
public class TestMyException {
    public static void main(String[] args) {
        int x = 5, y = 1000;
        try {
            float z = (float) x / (float) y;
            if (z < 0.01) {
                throw new MyExeption("Given data are not proper..!");
            }
        } catch (MyExeption e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("It prints always..!");
        }
    }
}
