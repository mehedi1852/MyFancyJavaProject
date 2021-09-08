package com.company;

import java.util.Scanner;

class FIVCalculation{
    private static  FIVCalculation calculate;

    private FIVCalculation(double p, double r, double y){
        double fiv = p * (Math.pow((1+r / 100), y));
    }

    public static FIVCalculation getCalculate(double p, double r, double y){
        return calculate = new FIVCalculation(p, r, y);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double presentValue=sc.nextDouble();
        System.out.print("Enter the interest rate: ");
        double interestRate=sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        double timeInYear=sc.nextDouble();

        FIVCalculation finalValuation = FIVCalculation.getCalculate(presentValue, interestRate, timeInYear);
        System.out.println(finalValuation);
    }
}
