package com.company.cdac.cop6;

import java.util.Scanner;

public class AdditionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Addition addition = new Addition();

        System.out.println("Enter 2 integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " using bitwise operations: " + addition.byBitwiseOperations(a, b));

        System.out.println(a + " + " + b + " using decrement operations: " + addition.byDecrementOperator(a, b));

        addition.byClassMember(a, b);
        System.out.println(a + " + " + b + " using class member: " + addition.getSum());

        System.out.println(a + " + " + b + " using for loop operations: " + addition.byForLoop(a, b));

        System.out.println(a + " + " + b + " using recursion: " + addition.byRecursion(a, b));

        scanner.close();
    }
}
