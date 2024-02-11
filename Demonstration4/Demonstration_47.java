package Demonstration4;

import java.io.DataInputStream;

public class Demonstration_47 { // input with DataInputStream
    public static void main(String[] args) {
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;
        try {
            DataInputStream in = new DataInputStream(System.in);

            String tempString;
            System.out.print("Enter principal amount: ");
            System.out.flush();
            tempString = in.readLine();

            principalAmount = Float.valueOf(tempString);
            System.out.print("Enter rate of interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);
            System.out.print("Enter number of years: ");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            // input is over : calculate the interest
            float interestTotal = principalAmount* rateOfInterest*numberOfYears/100;
            System.out.println("Total interest is: " + interestTotal);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
