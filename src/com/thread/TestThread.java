package com.thread;

public class TestThread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
       // t1.start(); //calls run method
        MyTask my = new MyTask();
        Thread t2 = new Thread(my);
        t2.start();

    }
}
