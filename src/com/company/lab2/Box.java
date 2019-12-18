package com.company.lab2;

public class Box {
    private double width;
    private double heigh;
    private double depth;


    public Box() {
        heigh = 1;
        depth = 1;
        width = 1;
        show();
    }

    public Box(double general) {
        heigh = general;
        width = general;
        depth = general;
        show();
    }

    public Box(double width, double heigh, double depth) {
        this.depth = depth;
        this.width = width;
        this.heigh = heigh;
        show();
    }

    public void show() {
        System.out.println("Box has the following params: width: "+width+"cm heigh: " + heigh + "cm depth: " + depth + "cm total surface of: " + surface() + "cm**2 and the volume of: " + volume() + "cm**3");
    }

    public double surface() {
        return 2*(depth*width + width*heigh + depth*heigh);
    }

    public double volume() {
        return depth*width*heigh;
    }
}
