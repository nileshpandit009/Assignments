package com.company.cdac.cop6;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.nextLine();

		System.out.println("Factorial(" + num + ") = " + getFactorial(num));
	}

	private static int getFactorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * getFactorial(num - 1);
		}
	}
}
