package com.company.cdac.cop2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AverageScn {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double avg;
		int numCount = 0;

		System.out.println("Enter at least 3 numbers to calculate average (ex. 10 20 30 ...):");
		String input = sc.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
		while (stringTokenizer.hasMoreTokens()) {
			sum += Double.parseDouble(stringTokenizer.nextToken());
			++numCount;
		}

		avg = sum / numCount;
		System.out.println("Average = " + avg);

	}
}
