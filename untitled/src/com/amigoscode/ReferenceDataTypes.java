package com.amigoscode;

import java.time.LocalDate;

public class ReferenceDataTypes {
    public static void main(String[] args) {
        //Non primitive data types AKA reference types
            String name = new String("Amigoscode");
            int age = 20;
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfMonth());
    }
}
