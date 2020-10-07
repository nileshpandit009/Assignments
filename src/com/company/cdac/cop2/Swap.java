package com.company.cdac.cop2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("First = " + first + "\tSecond = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Swapping:");
        System.out.println("First = " + first + "\tSecond = " + second);
    }
}
