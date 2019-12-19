package com.company.lab7;

public class Cube implements GeometricBody{
    double a;

    Cube(double a) {
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6*a*a;
    }

    @Override
    public double getVolume() {
        return a*a*a;
    }
}
