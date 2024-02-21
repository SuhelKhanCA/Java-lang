public class B extends A {
    int k,l;
    B(int i, int j, int k, int l){
        super(i, j);
        this.k = k;
        this.l = l;
    }
    int sum(){
        return super.sum() + k + l;
    }
}
