package com.company.lab7;

public class Sphere implements GeometricBody{
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (4*Math.PI*radius*radius*radius)/3;
    }
}
