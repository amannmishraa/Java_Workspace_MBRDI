package com.thread.shareddata;

public class Thread2 {
    PrintEvenNum obj;
    public Thread2(PrintEvenNum obj){
        this.obj = obj;
    }
    public void run(){
        obj.printNum();//thread class
    }
}
