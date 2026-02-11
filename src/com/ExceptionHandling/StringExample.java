package com.ExceptionHandling;

public class StringExample {
    public static void main(String[] args) {

        String name = "uppu";
        name = "Hello" + name;

        StringBuilder str = new StringBuilder();
        str.append("xyz");
        System.out.println(str);          // xyz

        str.replace(0, 3, "ABC");
        System.out.println(str);          // ABC

        System.out.println(str.reverse()); // CBA

        StringBuffer strBuff = new StringBuffer();
    }
}
