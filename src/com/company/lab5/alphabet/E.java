package com.company.lab5.alphabet;

public class E extends D {
    protected String e = "E state";

    public E(String e, X x) {
        super("state d", x);
        this.e = e;
    }

    public String getState() {
        return this.e;
    }
}
