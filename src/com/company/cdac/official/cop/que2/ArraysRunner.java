package com.company.cdac.official.cop.que2;

import java.util.Scanner;

public class ArraysRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArraysRunner arraysRunner = new ArraysRunner();

        int[] array1 = arraysRunner.inputArray();
        int[] array2 = arraysRunner.inputArray();

        System.out.println("Arrays are " + (Arrays.isEqual(array1, array2) ? "" : "NOT ") + "equal.");

        ArraysRunner.scanner.close();
    }

    private int[] inputArray() {
        System.out.println("Enter array size: ");
        int[] arr = new int[scanner.nextInt()];
        scanner.nextLine();
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arr;
    }
}
