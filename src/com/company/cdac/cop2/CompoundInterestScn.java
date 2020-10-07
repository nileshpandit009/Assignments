package com.company.cdac.cop2;

import java.util.Scanner;

public class CompoundInterestScn {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double rate = sc.nextDouble();
        System.out.println("Enter time period (in years):");
        double time = sc.nextDouble();

        /* Calculate compound interest */
        double CI = principal * (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is "+ CI);
    }
}
