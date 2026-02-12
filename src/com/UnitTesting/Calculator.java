package com.UnitTesting;

public class Calculator {
    public int FindBig(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public int FindSmall(int a, int b) {
        if (a > b)
            return b;
        else
            return a;

    }
}
