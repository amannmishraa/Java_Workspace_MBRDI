package com.ExceptionHandling;

public class Sample {
    public static void main(String[] args) {
       try {
           int x = 0;
           int y = 0;
           int z = y / x;
           System.out.println(z);
       } catch (ArithmeticException e) {
           System.out.println("cant divide by zero");
           System.out.println(e);
       }
    }

}