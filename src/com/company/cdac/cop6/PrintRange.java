package com.company.cdac.cop6;

import java.util.Scanner;

public class PrintRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintRange printRange = new PrintRange();

        System.out.println("Enter 2 integers:");
        String output = printRange.printRange(scanner.nextInt(), scanner.nextInt());
        System.out.println(output);
    }

    private String printRange(int from, int to) {
        StringBuilder range = new StringBuilder();
        range.append("[");
        if (from == to) {
            range.append(from);
        } else if (from < to) {
            for (int i = from; i < to; i++) {
                range.append(i).append(", ");
            }
            range.append(to);
        } else {
            for (int i = from; i > to; i--) {
                range.append(i).append(", ");
            }
            range.append(to);
        }

        range.append("]");

        return range.toString();
    }
}
