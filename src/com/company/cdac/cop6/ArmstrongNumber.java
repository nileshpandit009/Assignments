package com.company.cdac.cop6;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();

        System.out.println("Enter a number:");
        System.out.println("The number is "
                + (armstrongNumber.isArmstrongNumber(scanner.nextInt()) ? "" : "NOT ")
                + "an armstrong number");

        scanner.close();
    }

    private boolean isArmstrongNumber(int number) {
        int length = this.getLength(number);
        int copy = number;
        int result = 0;
        while (number > 0) {
            int remainder = number % 10;
            result += (int) Math.pow(remainder, length);
            number = number / 10;
        }

        return (copy == result);
    }

    private int getLength(int number) {
        return String.valueOf(number).length();
    }
}
