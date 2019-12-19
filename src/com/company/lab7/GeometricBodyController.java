package com.company.lab7;

import java.util.List;

public class GeometricBodyController {
    List<GeometricBody> geometricBodies;
    GeometricBodyController(List<GeometricBody> geometricBodies) {
        this.geometricBodies = geometricBodies;
    }

    public GeometricBody maxVolume() {
        double maxVolume = 0;
        GeometricBody maxGeo = geometricBodies.get(0);
        for (GeometricBody geometricBody: geometricBodies) {
            if (geometricBody.getVolume()>maxVolume) {
                maxGeo = geometricBody;
                maxVolume = maxGeo.getVolume();
            }
        }
        return maxGeo;
    }

    public GeometricBody maxSurface() {
        double maxSurface = 0;
        GeometricBody maxGeo = geometricBodies.get(0);
        for (GeometricBody geometricBody: geometricBodies) {
            if (geometricBody.getSurface()>maxSurface) {
                maxGeo = geometricBody;
                maxSurface = maxGeo.getSurface();
            }
        }
        return maxGeo;
    }
}
