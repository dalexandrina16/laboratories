package com.company.lab1;

public class Monitor {
    private String color;
    private double width;
    private double height;
    private int[] resolution = new int[2];

    Monitor(String color, double width, double height, int resolution1, int resolution2){
        this.color =  color;
        this.width =  width;
        this.height = height;
        this.resolution[0] =  resolution1;
        this.resolution[1] = resolution2;
        System.out.println("Your monitor object has been created and it is " + this.color + " with width of " + this.width + " height of " + this.height + " and the resolution equal with " + this.resolution[0] +"x" +this.resolution[1]);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public int[] getResolution() {
        return resolution;
    }
    public double area(){
        return this.width*this.height;
    }

    public int calcresolution(){
        return this.resolution[0]*this.resolution[1];
    }

}
