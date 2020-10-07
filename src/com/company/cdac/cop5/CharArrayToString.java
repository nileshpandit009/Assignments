package com.company.cdac.cop5;

import java.util.Scanner;

public class CharArrayToString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int arrSize = scanner.nextInt();
        scanner.nextLine();
        char[] charArray = new char[arrSize];

        System.out.println("Enter array elements (char):");
        for (int i = 0; i < arrSize; i++) {
            charArray[i] = scanner.nextLine().charAt(0);
        }

        System.out.println("Converting char array to string......");
        String arrayToString = charArrayToString(charArray);

        System.out.println("Resultant string: " + arrayToString);

        scanner.close();
    }

    @SuppressWarnings("all")
    private static String charArrayToString(char[] array) {
        String result = "";
        for (char ch : array) {
            result = result + ch;
        }
        return result;
    }
}
