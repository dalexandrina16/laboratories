package com.company.lab5.alphabet;

public class C extends B {
    protected String c = "C state";

    public C(String c, X x) {
        super("b state", x);
        this.c = c;

    }

    public String getState() {
        return this.c;
    }
}
