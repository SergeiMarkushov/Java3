package com.example.lesson6;

public class Calculator {
    int a;
    int b;

    public Integer sum (Integer a, Integer b){
        return a + b;
    }
    public Integer sum (){
        return a + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

