package com.company.cdac.cop5;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int arrSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter array elements:");
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Sorting the array......");
        int[] sortedArray = bubbleSort(array);

        System.out.println("Sorted array");
        displayArray(sortedArray);

        scanner.close();

    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
