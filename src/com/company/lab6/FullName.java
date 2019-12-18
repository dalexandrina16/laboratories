package com.company.lab6;

public class FullName {
    private String fullName;
    FullName(String first, String middle, String last) {
        this.fullName = first + " " + middle + " " + last;
    }

    public String getFullName() {
        return fullName;
    }
}
