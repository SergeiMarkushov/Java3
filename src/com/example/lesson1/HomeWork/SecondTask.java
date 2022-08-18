package com.example.lesson1.HomeWork;

/*
2. Написать метод, который преобразует массив в ArrayList;
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) {

        String[] array = {"Hello", "Goodbye", "SeeYou", "Ever", "Never"};

        List<String> arrayList = convertToList(array);

        System.out.println(arrayList.getClass() + " " + arrayList);


    }
    public static <T> List convertToList(T[] array){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }
}
