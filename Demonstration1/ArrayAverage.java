package Demonstration1;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40}; // array initialization
        // Testing array
        System.out.println(Arrays.toString(a));

        float sum = 0, average;
        for (int i = 0; i < a.length; i++) { // length is property
            sum += a[i];
        }
        average = sum/a.length;
        System.out.println("Average is = " + average);
    }
}
