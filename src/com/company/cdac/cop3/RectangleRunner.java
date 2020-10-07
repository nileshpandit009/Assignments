package com.company.cdac.cop3;

import java.util.Scanner;

public class RectangleRunner {

    private static double width;
    private static double height;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        RectangleRunner.getInput();

        rectangle.setWidth(RectangleRunner.width);
        rectangle.setHeight(RectangleRunner.height);

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }

    private static void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width of rectangle:");
        RectangleRunner.width = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter height of rectangle:");
        RectangleRunner.height = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();
    }
}
