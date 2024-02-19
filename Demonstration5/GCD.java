package Demonstration5;

public class GCD {
    int m,n;
    int gcd(int m, int n){
        if(m>n) return gcd(n, m);
        if(m==n) return m;
        if(m==0) return n;
        if(m==1) return 1;
        return gcd(m, n %m);
    }
    public static void main(String[] args) {
        GCD obj = new GCD();
        obj.m = Integer.parseInt(args[0]);
        obj.n = Integer.parseInt(args[1]);
        System.out.println("GCD is: " + obj.gcd(obj.m, obj.n));
    }
}
