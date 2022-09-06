package com.example.lesson7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException, InvocationTargetException {

//        Cat cat = new Cat("Barsic", 10);
//        Class<Cat> catClass1 = Cat.class;


//        Class<Cat> catClass = (Class<Cat>) cat.getClass();
//        Class<?> cClass = Class.forName("java.lang.Byte");

//        System.out.println(catClass1.getName());
//        System.out.println(catClass1.getSimpleName());
//
////        System.out.println(catClass1.getModifiers()); //1
//        int modifiers = catClass1.getModifiers();
//        System.out.println(Modifier.isPublic(modifiers)); //true
//
////        catClass1.getSuperclass(); // родительский скласс
////        catClass1.getInterfaces(); //список интерфейсов
//
//        Method[] methods = catClass1.getMethods();
//        Method[] declaredMethod = catClass1.getDeclaredMethods();
//        catClass1.getMethod("info", String.class, Integer.class);
//
//        Field[] fields = catClass1.getFields();
//        Field[] declaredFields = catClass1.getDeclaredFields();

//        Field[] declaredFields = catClass1.getDeclaredFields();
//
//        for (Field f:
//             declaredFields) {
//            System.out.println(f);
//        }
//
//        Field age = catClass1.getDeclaredField("age");
//        age.setAccessible(true);
//        age.set(cat, 13);
//
//        System.out.println(cat);

//        @Deprecated
//        Date date = new Date(2022,10,10);

        
        CatAnnotation catAnnotation = new CatAnnotation("Murzik", "black", 10,10);
        Class<CatAnnotation> catAnnotationClass = CatAnnotation.class;

        for (Method methods:
             catAnnotationClass.getDeclaredMethods()) {
            if (methods.isAnnotationPresent(MyAnnotation.class)){
                if (methods.getAnnotation(MyAnnotation.class).priority() > 6) {
                    System.out.println(methods.getAnnotation(MyAnnotation.class).priority());
                    methods.invoke(catAnnotation);
                }
            }
        }

    }
}
