
package com.example.lesson4;
public class DeadLockMain {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        DeadLockOne one =new DeadLockOne();
        one.start();
        DeadLockTwo two = new DeadLockTwo();
        two.start();
    }
    static class DeadLockOne extends Thread {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 1 catch lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 wait lock2");
                synchronized (lock2){
                    System.out.println("Thread 1 catch lock1 and lock2");
                }
            }
        }
    }

    static class DeadLockTwo extends Thread {
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread 2 catch lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 wait lock1");
                synchronized (lock1){
                    System.out.println("Thread 2 catch lock1 and lock2");
                }
            }
        }
    }
}
