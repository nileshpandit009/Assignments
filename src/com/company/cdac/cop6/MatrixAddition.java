package com.company.cdac.cop6;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions of matrix");
        System.out.println("Enter M:");
        int m = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input 2 matrices for addition");
        int[][] matrix1 = inputMatrix(m, n);
        int[][] matrix2 = inputMatrix(m, n);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2");
        displayMatrix(matrix2);

        System.out.println("Adding matrices......");
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Result Matrix:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    private static int[][] inputMatrix(int m, int n) {
        int[][] matrix = new int[m][n];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        return matrix;
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Cannot add matrices with uneven dimensions
        if (matrix1.length != matrix2.length) {
            return new int[1][1];
        }

        int m = matrix1.length;
        int n = matrix1[0].length;
        int[][] resultMtx = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultMtx[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMtx;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
