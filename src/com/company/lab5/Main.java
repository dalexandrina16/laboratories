package com.company.lab5;

import com.company.lab5.alphabet.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static A giveObject(int type) {
        switch(type) {
            case 1:
                return new B("b state", new X("x state"));
            case 2:
                return new C("c state", new X("x state"));
            case 3:
                return new D("d state", new X("x state"));
            case 4:
                return new E("e state", new X("x state"));
            case 5:
                return new F("f state", new X("x state"));
            case 6:
                return new G("g state", new X("x state"));
            case 7:
                return new H("h state", new X("x state"));
            case 8:
                return new I("i state", new X("x state"));
            case 9:
                return new J("j state", new X("x state"));
            default:
                return new A("a state", new X("x state"));
        }
    }

    public static void main(String[] args) {
        List<A> letters = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            letters.add(giveObject(i));
        }

        for (A let : letters) {
            PrintStream var10000 = System.out;
            String var10001 = let.toString();
            var10000.println(var10001 + "State: " + let.getState());
        }

        J j = new J("j state", new X("x state"));
        H h = new H("h state", new X("eij"));
        System.out.println(h.toString());
        System.out.println(j.toString());
    }
}