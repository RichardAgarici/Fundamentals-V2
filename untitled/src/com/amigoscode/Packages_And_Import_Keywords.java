package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Packages_And_Import_Keywords {
    public static void main(String[] args) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        System.out.println(date);
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();


    }
}
