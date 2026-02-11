package com.thread.shareddata;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService eserve1 = Executors.newFixedThreadPool(10);
        Future futu1 = eserve1.submit(() -> {
            System.out.println("I make a triangle, I am a runnable");
            for (int i = 1; i <= 4; i++) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Runnable ending....");
        });
        Future<Integer> futu2 = eserve1.submit(()->{
            System.out.println("I printed a summation, I'm callable");
            return 100+100+500+23;
        });
        try{
            Integer result = futu2.get(5, TimeUnit.SECONDS);
            System.out.println("The summation is "+result);
            SomeFunnyTask("having Fun!");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            //eserve1.shutdowm();
        }
    }
    private static void SomeFunnyTask(String funnyname){
        System.out.println("I'm not from ExecutorService "+ funnyname);
    }
}
