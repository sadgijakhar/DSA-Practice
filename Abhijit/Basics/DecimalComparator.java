package Basics;

import java.util.Scanner;

public class DecimalComparator {
    public boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int roundedNum1 = (int) Math.round(num1);
        int roundedNum2 = (int) Math.round(num2);
        if (roundedNum1 == roundedNum2) {
            // System.out.println(roundedNum1);
            return true;
        }
        // System.out.println(roundedNum1);
        return false;
    }

    // public boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    //     int roundedNum1 = (int) num1*1000;
    //     int roundedNum2 = (int) num2*1000;
    //     if (roundedNum1 == roundedNum2) {
    //         // System.out.println(roundedNum1);
    //         System.out.println(roundedNum1);
    //         System.out.println(roundedNum2);
    //         return true;
    //     }
    //     // System.out.println(roundedNum1);
    //     System.out.println(roundedNum1);
    //     System.out.println(roundedNum2);
    //     return false;
    // }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number here:");
        double number1 = input.nextDouble();
        System.out.println("Enter the 2nd number here:");
        double number2 = input.nextDouble();
        input.close();

        DecimalComparator checkDecimal = new DecimalComparator();
        boolean result = checkDecimal.areEqualByThreeDecimalPlaces(number1, number2);
        System.out.println(result);
    }
}
