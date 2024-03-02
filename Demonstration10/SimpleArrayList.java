package Demonstration10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * SimpleArrayList
 */
public class SimpleArrayList {

    public static void main(String[] args) {
        int sum = 0;
        float avg;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the input:");
        Scanner inp = new Scanner(System.in);
        while (inp.hasNextInt()) {
            list.add(inp.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        avg = sum/list.size();
        System.out.println("average is :"+ avg);
    }
}