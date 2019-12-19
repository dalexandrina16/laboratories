package com.company.lab7;

public class Parallelepiped implements GeometricBody {

    double gamma;
    double alpha;
    double beta;
    double a;
    double b;
    double c;

    public Parallelepiped(double gamma, double alpha, double beta, double a, double b, double c) {
        this.gamma = gamma;
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 2*(a*b*Math.sin(gamma) + b*c*Math.sin(alpha) + c*a*Math.sin(beta));
    }

    @Override
    public double getVolume() {
        return a*b*c*Math.sqrt(1+2*Math.cos(alpha)*Math.cos(beta)*Math.cos(gamma) - Math.pow(Math.cos(alpha), 2) - Math.pow(Math.cos(beta), 2) - Math.pow(Math.cos(gamma), 2));
    }
}
