package com.company.cdac.cop6;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrimeNumbers primeNumbers = new PrimeNumbers();
        System.out.println("Enter N to find prime numbers:");
        primeNumbers.displayPrimes(scanner.nextInt());
        scanner.close();
    }

    private void displayPrimes(int num) {
        StringBuilder primeNumbers = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count == 2) {
                primeNumbers.append(i).append("  ");
            }
        }

        System.out.println(primeNumbers.toString());
    }
}
