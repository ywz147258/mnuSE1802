package com.ywz.selenium.action;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        ContentThread thread1= new ContentThread(0,100);
//        ContentThread thread2 = new ContentThread(100,100);
//        ContentThread thread3 = new ContentThread(200,100);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        ExecutorService es1= Executors.newFixedThreadPool(3);
        for(int i=0;i<=500;i+=100){
            es1.execute( new ContentRunnable(i,100));
        }
    }
}
