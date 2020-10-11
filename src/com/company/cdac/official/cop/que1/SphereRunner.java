package com.company.cdac.official.cop.que1;

import java.util.Scanner;

public class SphereRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of sphere:");
        Sphere sphere = new Sphere(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Surface area: " + sphere.calculateSurfaceArea());
        System.out.println("Volume: " + sphere.calculateVolume());

        scanner.close();
    }
}
