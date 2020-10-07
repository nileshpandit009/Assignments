package com.company.cdac.cop4;

import java.util.Scanner;

public class ASCIIRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character: ");
        System.out.println("ASCII value: " + ASCII.getASCIIValue(scanner.nextLine().charAt(0)));

        scanner.close();
    }
}
