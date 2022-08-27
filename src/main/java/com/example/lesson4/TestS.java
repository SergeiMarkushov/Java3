package com.example.lesson4;

import java.util.TreeMap;

public class TestS {
    public static void main(String[] args) {

    }
    public synchronized static void mstatic1(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized static void mstatic2(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TestThreadStatic {
    public static void main(String[] args) {
        TestS testS = new TestS();

        new Thread(new Runnable() {
            @Override
            public void run() {
                TestS.mstatic1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                TestS.mstatic2();
            }
        }).start();
    }
}
