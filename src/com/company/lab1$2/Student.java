package com.company.lab1$2;


public class Student {
    private String name;
    private int age;
    private double mark;

    Student(String name, int age, double mark){
        this.name = name;
        setAge(age);
        setMark(mark);
        System.out.println("Student " + this.name + " created, age: " + this.age + " mark: " + this.mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=16 && age<=100) {
            this.age = age;
        } else {
            this.age = 19;
            System.out.println("The age is not acceptable, it was set to 19 for now");
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark>0 && mark<=10) {
            this.mark = mark;
        } else {
            this.mark = 0.5;
            System.out.println("The mark is not acceptable, it was set to 0.5 for now");
        }
    }
}
