package com.company.lab5.alphabet;

public class J extends I {
    protected String j = "J state";

    public J(String j, X x) {
        super("i state", x);
        this.j = j;
    }

    public String getState() {
        return this.j;
    }
}