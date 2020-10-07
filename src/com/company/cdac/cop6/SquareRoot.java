package com.company.cdac.cop6;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SquareRoot squareRoot = new SquareRoot();
        System.out.println("Enter a number:");
        System.out.println(squareRoot.sqrt(scanner.nextDouble()));

        scanner.close();
    }

    /*
    * Based on the formula
    * sqrt(n+1) = { sqrt(n) + {n / sqrt(n)} } / 2.0
    */
    private double sqrt(double number) {
        double temp;
        double sqrt = number / 2;

        do {
            temp = sqrt;
            sqrt = (temp + (number / temp)) / 2;
        } while ((temp - sqrt) != 0);

        return sqrt;
    }
}
