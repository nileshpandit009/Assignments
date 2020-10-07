package com.company.cdac.cop6;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int arrSize = scanner.nextInt();
        scanner.nextLine();

        int[] input = new int[arrSize];
        System.out.println("Enter " + arrSize + "integers:");
        for (int i = 0; i < arrSize; i++) {
            input[i] = scanner.nextInt();
            scanner.nextLine();
        }


        // Find largest and second largest from array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i : input) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);

        scanner.close();
    }

}
