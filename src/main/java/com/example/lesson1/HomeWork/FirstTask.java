package com.example.lesson1.HomeWork;

/*1. Написать метод, который меняет два
элемента массива местами.(массив может быть любого ссылочного типа);
 */

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {


        String[] array = {"One", "Two", "Three", "Four"};

        System.out.println(Arrays.toString(array));
        changeArray(array, 0,3);
        System.out.println(Arrays.toString(array));


    }

    public static <T> void changeArray(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
