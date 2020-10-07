package com.company.cdac.cop5;

import java.util.Scanner;

public class ReverseArray {

    private static int[] array;

    public static void main(String[] args) {
        initArray();
        displayArray();
        reverseArray();
        displayArray();
    }

    private static void initArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int arrSize = scanner.nextInt();
        array = new int[arrSize];

        System.out.println("Enter " + arrSize + " array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
    }

    private static void reverseArray() {
        System.out.println("Reverse Array:");
        for (int i = 0, j = array.length - 1; (i < array.length) && (j >= (array.length / 2)); i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private static void displayArray() {
        System.out.println("Display Array:");
        for (int i : array) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
