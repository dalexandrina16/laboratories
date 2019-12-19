package com.company.lab5.alphabet;

public class H extends G {
    protected String h = "H state";
    private X x = new X("hxhxhxh");

    public H(String h, X x) {
        super("g state", x);
        this.h = h;
    }

    public String getState() {
        return this.h;
    }
}
