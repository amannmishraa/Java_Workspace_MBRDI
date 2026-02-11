package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class SampleCompileType {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 10;
            int z = y / x;
            System.out.println(z);
            int[] num = new int [5];
            num[4] = 100;
            FileReader fr = new FileReader("text.txt");
        } catch (ArithmeticException | FileNotFoundException e) {
            System.out.println("cant divide by zero");
            System.out.println(e);
        }finally {
            System.out.println("This block will get executed no matter what");
        }
    }
}
