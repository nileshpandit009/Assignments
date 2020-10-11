package com.company.cdac.official.cop.que1;

public class Sphere {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateSurfaceArea() {
        return (4 * Math.PI * this.radius * this.radius);
    }

    public double calculateVolume() {
        return ((4.0 / 3.0) * Math.PI * this.radius * this.radius * this.radius);
    }
}
