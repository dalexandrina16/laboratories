package com.company.lab1;

import java.util.Scanner;

public class Main {
    private static int monitorcount = 0;

    private static Monitor readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the color of monitor number " + (monitorcount+1));
        String localcolor = sc.nextLine();
        System.out.println("Input the width of monitor number " + (monitorcount+1));
        double localwidth = sc.nextDouble();
        System.out.println("Input the height of monitor number " + (monitorcount+1));
        double localheight = sc.nextDouble();
        System.out.println("Input the first parameter of the resolution of monitor number " + (monitorcount+1));
        int localres1 = sc.nextInt();
        System.out.println("Input the second parameter of the resolution of monitor number " + (monitorcount+1));
        int localres2 = sc.nextInt();
        monitorcount++;
        return new Monitor(localcolor, localwidth , localheight , localres1, localres2 );
    }

    private static void compare(Monitor first, Monitor second){
        if (first.getColor()==second.getColor()){
            System.out.println(" The monitors have the same color! ");
        } else{
            System.out.println(" The monitors have different colors! ");
        }
        if (first.area()>second.area()){
            System.out.println(" The first monitor is larger! ");
        } else if(first.area()<second.area()){
            System.out.println(" The second monitor is larger! ");
        } else {
            System.out.println(" The monitors have the same size! ");
        }
        if (first.calcresolution()>second.calcresolution()){
            System.out.println(" The first monitor has a better resolution! ");
        } else if(first.calcresolution()<second.calcresolution()){
            System.out.println(" The second monitor has a better resolution! ");
        } else {
            System.out.println(" The monitors have the same resolution! ");
        }
    }



    public static void main(String[] args) throws NullPointerException{
        Monitor f = readData();
        Monitor s = readData();
        compare(f, s);
    }
}