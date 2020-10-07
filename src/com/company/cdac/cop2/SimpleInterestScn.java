package com.company.cdac.cop2;

import java.util.Scanner;

public class SimpleInterestScn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount:");
		double principal = sc.nextDouble();
		System.out.println("Enter rate of interest:");
		double rate = sc.nextDouble();
		System.out.println("Enter time period (in years):");
		double years = sc.nextDouble();

		double si = (principal * rate * years) / 100;

		System.out.println("Simple Interest = " + si);
	}
}
