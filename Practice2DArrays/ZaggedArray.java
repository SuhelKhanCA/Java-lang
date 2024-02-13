package Practice2DArrays;
import java.util.Arrays;
class ZaggedArray{ // A simple program to explain the jagged array
    public static void main(String[] args){
        System.out.println("------ZAGGED ARRAY-----");
        int a[][] = new int[4][];
        a[0] = new int[1]; //a[0][] = {0};
        a[1] = new int[2]; //a[1][] = {1, 2};
        a[2] = new int[3]; //a[2][] = {3, 4, 5};
        a[3] = new int[4]; //a[3][]= {6, 7, 8, 9};
        int counter = 0;
        for(int i = 0; i< a.length; i++){
            for(int j=0; j < a[i].length; j++){
                a[i][j] = counter;
                counter++;
            }
        }
        // le bhaiya omfo
        for(int i[]: a){
            System.out.println(Arrays.toString(i));
        }
    }
}