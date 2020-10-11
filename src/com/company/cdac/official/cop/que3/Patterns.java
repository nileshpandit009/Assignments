package com.company.cdac.official.cop.que3;

public class Patterns {
    public static void pattern1(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
