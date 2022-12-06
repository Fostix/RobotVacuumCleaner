package com.robotVacuumCleaner.robo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2012, Month.APRIL, 4, 22, 12);
        DateTimeFormatter ex1 = DateTimeFormatter.ofPattern("dd.MM EEEE hh:mm");
        //LocalDate localDate = LocalDate.now();

//        TemporalAccessor a = ex1.parse(new Scanner(System.in).nextLine());
        //System.out.println(ld);
        //System.out.println(ex1.format(ld));
        System.out.println(ex1.parse("04.04 Wednesday 10:12"));
    }
}
