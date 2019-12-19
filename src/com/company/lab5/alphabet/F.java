package com.company.lab5.alphabet;

public class F extends E {
    protected String f = "F state";

    public F(String f, X x) {
        super("state e", x);
        this.f = f;
    }

    public String getState() {
        return this.f;
    }
}