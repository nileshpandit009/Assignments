package com.company.cdac.cop5;

import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Average of array elements: " + (sum / arr.length));

        scanner.close();
    }
}
