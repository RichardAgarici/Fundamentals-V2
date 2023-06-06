package com.amigoscode;

public class Difference_Between_Primitives_And_Reference_Types {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a=100;
        System.out.println("a "+ a + " b "+b);

        Person alex = new Person("Alex");
        Person mariam = alex;
        Person alex2=mariam;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        System.out.println(alex2.name + " "+ mariam.name);

        alex.name="Alexander";

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person{
        String name;
        Person (String name){
            this.name = name ;


        }
    }

}
