package com.amigoscode;

public class Switch_Statement {
    public static void main(String[] args) {
        String gender = "FEMALE";

        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_TO_SAY")) {

        } else {

        }
        switch (gender) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_TO_SAY":
                System.out.println("Prefer not to say");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }

    }
