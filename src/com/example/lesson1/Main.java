package com.example.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        AccountInt accountInt1 = new AccountInt(100);
//        AccountInt accountInt2 = new AccountInt(200);
//
//        System.out.println(accountInt1.getCount());
//        System.out.println(accountInt2.getCount());
//
//
//        Account<Integer> integerAccount = new Account<>(200);
//        Account<Double> doubleAccount = new Account<>(300.0);
//
//
//        System.out.println(integerAccount.info());
//        System.out.println(doubleAccount.info());
//
//        Integer x = integerAccount.getCount();
//        Double y = doubleAccount.getCount();
//
//        System.out.println(x);
//        System.out.println(y);
//
//        List<String> list = new ArrayList<>();
//        List<Integer> listInt = new ArrayList<>();

//        Object[] array = new Long[10];
//        array[0] = "123";

//        list.add(String.valueOf(100L));

        Stats <Double> stats = new Stats<>(new Double[]{1.0, 2.0, 3.0});
        Stats <Double> stats2 = new Stats<>(new Double[]{0.0, 2.0, 4.0});
        System.out.println(stats.sameAvg(stats2));

        Stats<Integer> integerStats = new Stats<>(new Integer[]{1, 2, 3});
//        Stats<String> stringStats = new Stats<>(new String[] {1, 2, 3});

        System.out.println(stats.sameAvg(integerStats));



    }
}
