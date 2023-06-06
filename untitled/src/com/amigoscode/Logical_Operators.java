package com.amigoscode;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent= false;
        boolean isAmigosCodeMember = true;
        System.out.println(isAdult && isStudent);

        System.out.println(isAdult || isStudent);

        System.out.println((isAdult || isStudent) && isAmigosCodeMember );

        System.out.println((!isAdult || isStudent) && isAmigosCodeMember);

        System.out.println((!isAdult || isStudent) && !isAmigosCodeMember);

        System.out.println((!isAdult || !isStudent) && !isAmigosCodeMember);

        String name = "Mark";

        System.out.println(10>8 || 2<=2 && isAdult && name.contains("M"));
        System.out.println(10>8 || 2<=2 && !isAdult && name.contains("M"));

    }
}
