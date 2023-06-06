package com.amigoscode;

public class The_String_Class {
    public static void main(String[] args) {
        //String
        char a = 'A';
        char b = 'B';
        String nickName = "Richard";
        String name = new String("AmigosCode");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.charAt(9));
        System.out.println(name.contains("Code"));
        String code = new String("code");
        System.out.println(code.contains("code"));
        System.out.println(code.contains("codes"));
        System.out.println(name.equals(code));
    }
}
