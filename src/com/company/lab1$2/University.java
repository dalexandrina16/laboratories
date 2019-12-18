package com.company.lab1$2;

import java.util.ArrayList;

public class University {
    private String name;
    private int foundYear;
    private ArrayList<Student> studentList = new ArrayList<>();

    University(String name, int foundYear){
        this.name = name;
        setFoundYear(foundYear);
        System.out.println(this.name + " created, founded in " + this.foundYear);
    }

    public void addToList(Student s){
        this.studentList.add(s);
        System.out.println("Student added");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundYear() {
        return foundYear;
    }

    public void setFoundYear(int foundYear) {
        if(foundYear>1000 && foundYear<2020) {
            this.foundYear = foundYear;
        } else {
            this.foundYear = 2019;
            System.out.println("Foundation year is not acceptable, it is set to 2019 for the moment");
        }
    }

    public void getStudentList() {
        for (int i=0; i<studentList.size(); i++) {
            System.out.println(studentList.get(i).getName());
        }
    }

    public double averageMark(){
        double average = 0;
        for (int i=0; i<studentList.size(); i++) {
            average += studentList.get(i).getMark();
        }
        return average/studentList.size();
    }
}
