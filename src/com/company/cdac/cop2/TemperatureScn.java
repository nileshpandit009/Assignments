package com.company.cdac.cop2;

import java.util.Scanner;

public class TemperatureScn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius:");
		double cel = sc.nextDouble();
		sc.nextLine();

		double fahrenheit = (9 * cel / 5) + 32;
		System.out.println("Fahrenheit = " + fahrenheit);
	}
}
