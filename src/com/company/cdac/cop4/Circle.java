package com.company.cdac.cop4;

public class Circle {
    private double radius;

    private Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        checkRadiusValidity(radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        checkRadiusValidity(radius);
        this.radius = radius;
    }

    public double getCircumference() {
        return (2 * Math.PI * this.radius);
    }

    public double getArea() {
        return (Math.PI * this.radius * this.radius);
    }

    private void checkRadiusValidity(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius of the circle must be positive!");
        }
    }
}
