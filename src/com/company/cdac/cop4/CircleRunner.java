package com.company.cdac.cop4;

import java.util.Scanner;

public class CircleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        Circle circle = new Circle(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Circumference of circle: " + circle.getCircumference());

        scanner.close();
    }
}
