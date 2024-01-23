package Demonstration1;

public class My3DArray {
    public static void main(String[] args) {
        int[][][] my3D = new int[3][4][5];
        // Initialization
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    my3D[i][j][k] = i*j*k;
                }
            }
        }
        // Traversing 
        for (int i = 0; i < my3D.length; i++) {
            for (int j = 0; j < my3D[i].length; j++) {
                for (int k = 0; k < my3D[i][j].length; k++) {
                    System.out.println(my3D[i][j][k]);
                }
            }
        }

    }
}
