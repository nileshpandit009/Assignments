package com.company.cdac.cop6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();

        System.out.println("Enter an integer:");
        System.out.println("The number is "
                + (palindrome.isPalindrome(scanner.nextInt()) ? "" : "NOT ")
                + "palindrome");

        scanner.close();
    }

    private boolean isPalindrome(int number) {
        int copy = number;
        int digit, res = 0;
        while (number > 0) {
            digit = number % 10;
            res = (res * 10) + digit;
            number = number / 10;
        }
        return (copy == res);
    }
}
