package com.example.lesson4.shop;

public class Store {

    private int product = 0;

    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("Consumer buy one product");
        System.out.println("Products on store: " + product);
        notify();
    }

    public synchronized void put(){
        while (product >= 3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("Producer added one product");
        System.out.println("Products on store: " + product);
        notify();
    }
}
