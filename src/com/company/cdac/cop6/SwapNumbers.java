package com.company.cdac.cop6;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 integers:");
        int first = scanner.nextInt();
        scanner.nextLine();
        int second = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Before swap:");
        System.out.println("First: " + first + "\tSecond: " + second);

        // Method 1
/*
        first = first + second;
        second = first - second;
        first = first - second;
*/

        // Method 2
/*
        first = first * second;
        second = first / second;
        first = first / second;
*/

        // Method 3
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swap:");
        System.out.println("First: " + first + "\tSecond: " + second);

        scanner.close();
    }
}
