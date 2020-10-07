package com.company.cdac.cop6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N to find fibonacci numbers:");
        System.out.println(new Fibonacci().printFibonacci(scanner.nextLong()));
        scanner.close();
    }

    private String printFibonacci(long num) {
        StringBuilder fib = new StringBuilder();
        long f1 = 0, f2 = 1, f3;
        fib.append(f1).append(" ").append(f2).append(" ");

        for (int i = 1; i <= num; i++) {
            f3 = f1 + f2;
            fib.append(f3).append(" ");
            f1 = f2;
            f2 = f3;
        }

        return fib.toString();
    }
}
