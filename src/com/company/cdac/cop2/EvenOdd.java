package com.company.cdac.cop2;

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		sc.nextLine();

		if (num % 2 == 0) {
			System.out.println("The number is EVEN");
		} else {
			System.out.println("The number is ODD");
		}
	}
}
