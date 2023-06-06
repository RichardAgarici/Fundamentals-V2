package com.amigoscode;

public class Break_And_Continue {
    public static void main(String[] args) {
        String [] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("Bob")){
                continue;
            }
            System.out.println(name);

        }
    }
}
