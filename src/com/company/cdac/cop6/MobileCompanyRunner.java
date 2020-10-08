package com.company.cdac.cop6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class MobileCompanyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobileCompany mobileCompany = new MobileCompany();

        System.out.println("Enter total number of call:");
        int calls = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter plan (A/B/C):");
        String planStr = scanner.nextLine().charAt(0) + "";
        planStr = planStr.toUpperCase();

        try {
            MobileCompany.Plan plan = MobileCompany.Plan.valueOf(MobileCompany.Plan.class, planStr);
            double monthlyBill = mobileCompany.monthlyBill(calls, plan);
            System.out.println("Monthly Bill: " + monthlyBill);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid plan: " + planStr);
        } finally {
            scanner.close();
        }
    }
}
