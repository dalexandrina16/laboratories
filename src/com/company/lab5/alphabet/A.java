package com.company.lab5.alphabet;

public class A {
    protected String a = "A state";
    protected X x = new X("xxx");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public String getState() {
        return this.a;
    }

    public String toString() {
        return "This is a " + this.getClass() + " type object ";
    }
}
