package Demonstration4;

import java.util.ArrayList;
import java.util.Scanner;

class SimpleArrayLsit{
    public static void main(String[] args){
        int sum = 0;
        float avg = 0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        System.out.println("Enter the input");
        Scanner inp = new Scanner(System.in);
        while (inp.hasNextInt()) {
            ls.add(inp.nextInt());
        }
        for (int i = 0; i < ls.size(); i++) {
            sum += sum + ls.get(i);
        }
        avg = sum/ls.size();
        System.out.println("Average is: " + avg);
    }
}