package com.company.cdac.cop3;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public double getArea() {
        double p = getPerimeter() / 2;

        double temp = p * (p - this.side1) * (p - this.side2) * (p - this.side3);
        return Math.sqrt(temp);
    }
}
