package com.company.cdac.cop5;

import java.util.Scanner;

/*
 * Two-Dimensional array example
 */
public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter a 3x3 integer matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}
