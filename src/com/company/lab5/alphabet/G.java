package com.company.lab5.alphabet;

public class G extends F {
    protected String g = "G state";

    public G(String g, X x) {
        super("f state", x);
        this.g = g;
    }

    public String getState() {
        return this.g;
    }
}
