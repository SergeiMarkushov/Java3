package com.example.lesson1.HomeWork.ThirdTask;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> list;

    public Box(T... fruits){
        list = Arrays.asList(fruits);
    }

    public List<T> getList() {
        return list;
    }

    public Box(){
        list = new ArrayList<T>();
    }

    public void add(T fruit){
        list.add(fruit);
    }

    public void moveFruits(Box<T> box){
        box.getList().addAll(list);
        list.clear();
    }

    public float boxWeight(){
        if(list.isEmpty()){
            return 0;
        }else {
            return list.size() * list.get(0).getWight();
        }
    }

    public boolean compare(Box<? extends Fruit> box){
        return this.boxWeight() == box.boxWeight();
    }

    public void info(){
        if (list.isEmpty()){
            System.out.println("Box is empty");
        }else {
            System.out.println("In box " + list.get(0).toString() + " " + list.size() + "kg");
        }
    }
}
