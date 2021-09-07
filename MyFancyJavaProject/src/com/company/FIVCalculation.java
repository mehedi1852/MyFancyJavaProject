package com.company;

import java.util.*;
import java.util.Scanner;

public class FIVCalculation
{
    double fiv;
    FIVCalculation(double p, double r, double y)
    {    fiv = p * (Math.pow((1+r/100),y));
    }
}

class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
        double presentValue=sc.nextDouble();
        System.out.print("Enter the interest rate: ");
        double interestRate=sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        double timeInYear=sc.nextDouble();

        FIVCalculation finalValuation = new FIVCalculation(presentValue, interestRate, timeInYear);
        System.out.print("The future value is:= "+finalValuation.fiv+"\n");

    }
}
