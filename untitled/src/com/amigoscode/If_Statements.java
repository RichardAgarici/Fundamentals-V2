package com.amigoscode;

public class If_Statements {
    public static void main(String[] args) {
        //If statements
        int age = 17;
        if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age>=16 && age <18) {
            System.out.println("Im almost an adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}
