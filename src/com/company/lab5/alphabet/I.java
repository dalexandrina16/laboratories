package com.company.lab5.alphabet;

public class I extends H {
    protected String i = "I state";

    public I(String i, X x) {
        super("h state", x);
        this.i = i;
    }

    public String getState() {
        return this.i;
    }
}
