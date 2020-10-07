package com.company.cdac.cop6;

import java.util.Scanner;

public class SortStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int arrSize = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[arrSize];
        System.out.println("Enter " + arrSize + " strings:");
        for (int i = 0; i < arrSize; i++) {
            strings[i] = scanner.nextLine();
        }

        String[] sortedStrings = sortStrings(strings);

        System.out.println("Sorted strings are:");
        displayStrings(sortedStrings);

        scanner.close();
    }

    private static String[] sortStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        return strings;
    }

    private static void displayStrings(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
