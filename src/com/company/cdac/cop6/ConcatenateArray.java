package com.company.cdac.cop6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        ConcatenateArray concatArray = new ConcatenateArray();
        int[] result = concatArray.concatenateArrays(concatArray.inputArray(), concatArray.inputArray(), concatArray.inputArray());

        System.out.println("Concatenated array is:");
        concatArray.displayArray(result);
    }

    private int[] concatenateArrays(int[]... arrays) {
        int totalSize = 0;
        for (int[] array : arrays) {
            totalSize += array.length;
        }
        int[] result = new int[totalSize];
        int idx = -1;
        for (int[] array : arrays) {
            for (int element : array) {
                result[++idx] = element;
            }
        }

        return result;
    }

    private int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int[] array = new int[scanner.nextInt()];
        scanner.nextLine();
        System.out.println("Enter " + array.length + " integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Entered array is:");
        this.displayArray(array);
        return array;
    }

    private void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}
