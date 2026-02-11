package com.staticfinal;

public class Test {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.x = 10;
        obj.x++;
        System.out.println(obj.x);

        Sample.y = 100;
        SampleFinal sf = new SampleFinal();


    }
}
