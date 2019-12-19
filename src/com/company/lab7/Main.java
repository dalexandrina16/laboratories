package com.company.lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricBody> geometricBodies = new ArrayList<>();
        geometricBodies.add(new Cube(13));
        geometricBodies.add(new Sphere(32));
        geometricBodies.add(new Parallelepiped(12, 34, 56, 12, 2, 5));
        GeometricBodyController geometricBodyController = new GeometricBodyController(geometricBodies);
        System.out.println(geometricBodyController.maxSurface().getClass());
        System.out.println(geometricBodyController.maxVolume().getClass());
    }
}
