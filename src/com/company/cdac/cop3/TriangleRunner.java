package com.company.cdac.cop3;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Perimeter of triangle: " + triangle.getPerimeter());
        System.out.println("Area of triangle: " + triangle.getArea());
    }
}
