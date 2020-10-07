package com.company.cdac.cop2;

import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter basic salary:");

		double basicSal = sc.nextDouble();
		sc.nextLine();

		double hra = basicSal * 0.40;
		double pf = basicSal * 0.12;
		double salInHand = basicSal + hra + 1200 + 800 - (pf + 300);

		System.out.println("Salary in hand = " + salInHand);

	}
}
