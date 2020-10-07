package com.company.cdac.cop2;

import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age:");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("You are " + ((age > 18) ? "" : "NOT ") + "eligible for voting.");
	}
}
