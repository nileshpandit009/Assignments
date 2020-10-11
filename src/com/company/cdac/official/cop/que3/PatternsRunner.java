package com.company.cdac.official.cop.que3;

import java.util.Scanner;

public class PatternsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pattern size:");
        Patterns.pattern1(scanner.nextInt());
        scanner.close();
    }
}
