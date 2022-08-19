package com.example.lesson1.HomeWork.ThirdTask;

/*
3. Большая задача:
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.
 */

public class Main {
    public static void main(String[] args) {

        Orange orange = new Orange();
        Apple apple = new Apple();

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("Weight of apple is: " + apple.getWight());
        System.out.println("Weight of orange is: " + orange.getWight());

        orangeBox.info();

        appleBox.info();

        appleBox1.info();

        System.out.println();

        System.out.println("Is boxes equals? " + orangeBox.compare(appleBox));

        System.out.println();

        orangeBox.info();
        orangeBox1.info();
        System.out.println();
        System.out.println("Move fruits");
        orangeBox.moveFruits(orangeBox1);
        orangeBox.info();
        orangeBox1.info();



    }

}
