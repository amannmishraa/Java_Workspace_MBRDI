package com.thread.shareddata;

public class Thread1 {
    PrintEvenNum obj;
    public Thread1(PrintEvenNum obj){
        this.obj = obj;
    }
    public void run(){
        obj.printNum();//thread class
    }

    public void start() {
    }
}
