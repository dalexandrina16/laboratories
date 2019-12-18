package com.company.lab1$2;
import java.util.Scanner;


public class Main {

    private static int unCounter = 0;

    private static University readUniversityData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the name of the University number " + (unCounter+1));
        unCounter++;
        String localname = sc.nextLine();
        System.out.println("Input the foundation year ");
        int localyear = sc.nextInt();
        return new University(localname, localyear);
    }
    private static Student readStudentData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the name: ");
        String localname = sc.nextLine();
        System.out.println("Input the age ");
        int localage = sc.nextInt();
        System.out.println("Input the mark ");
        double localmark = sc.nextDouble();
        return new Student(localname, localage, localmark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        University un1 = readUniversityData();
        University un2 = readUniversityData();
        University un3 = readUniversityData();
        System.out.println("Input the number of students for " + un1.getName());
        int un1amount = sc.nextInt();
        System.out.println("Input the number of students for " + un2.getName());
        int un2amount = sc.nextInt();
        System.out.println("Input the number of students for " + un3.getName());
        int un3amount = sc.nextInt();
        for (int i=0; i<un1amount; i++) {
            System.out.println("    You are adding a student to " + un1.getName() + " ...");
            Student localStudent = readStudentData();
            un1.addToList(localStudent);
        }
        for (int i=0; i<un2amount; i++) {
            System.out.println("    You are adding  a student to " + un2.getName() + " ...");
            Student localStudent = readStudentData();
            un2.addToList(localStudent);
        }
        for (int i=0; i<un3amount; i++) {
            System.out.println("    You are adding a student to " + un3.getName() + " ...");
            Student localStudent = readStudentData();
            un3.addToList(localStudent);
        }

        System.out.println("    The average marks for our 3 Universities: ");
        System.out.println(un1.getName() + " : " + un1.averageMark());
        System.out.println(un2.getName() + " : " + un2.averageMark());
        System.out.println(un3.getName() + " : " + un3.averageMark());
    }
}
