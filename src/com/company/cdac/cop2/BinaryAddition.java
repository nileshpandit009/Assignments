package com.company.cdac.cop2;

import java.util.Scanner;

@SuppressWarnings("all")
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary (1 byte):");
        String num1 = sc.nextLine();
        System.out.println("Enter second binary (1 byte):");
        String num2 = sc.nextLine();

        if (num1.length() != num2.length()) System.exit(-1);

        int len = num1.length();    // Since both lengths are same.
/*

        int max = Math.max(num1.length(), num2.length());
        int min = Math.min(num1.length(), num2.length());
        int diff = max - min;

        if (num1.length() > num2.length()) {
            for (int i = 0; i < diff; i++) {
                num2 = "0" + num2;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                num1 = "0" + num1;
            }
        }
*/

        int carry = 0;
        String result = "";
        for (int i = 0; i < num1.length(); i++) {
            int i1 = num1.charAt(len - 1 - i) - '0';
            int i2 = num2.charAt(len - 1 - i) - '0';
            int temp = i1 + i2 + carry;
            carry = temp / 2;
            result = (temp % 2) + result;
        }

        System.out.println("Sum = " + result + ", Carry = " + carry);

    }
}
