package com.company.lab5.alphabet;

public class B extends A {
    protected String b;

    public B(String b, X x) {
        super("a state", x);
        this.b = b;
    }

    public String getState() {
        return this.b;
    }
}