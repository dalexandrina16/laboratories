package com.company.lab5.alphabet;

public class D extends C {
    protected String d = "D state";
    protected X x = new X("xgxgx");

    public D(String d, X x) {
        super("state c", x);
        this.d = d;
    }

    public String getState() {
        return this.d;
    }
}