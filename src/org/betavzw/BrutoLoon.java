package org.betavzw;

import java.time.LocalDate;
import java.time.Month;

public class BrutoLoon {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);
        int dag = vandaag.getDayOfMonth();
        System.out.println("De dag: " + dag);
        int maand = vandaag.getMonthValue();
        System.out.println("De maand: " + maand);
        int jaar = vandaag.getYear();
        System.out.println("Het jaar: " + jaar);
        Month maandEnum = vandaag.getMonth();
        System.out.println(maandEnum);
        maandEnum = Month.APRIL;
        System.out.println(maandEnum);
        LocalDate andereDatum = LocalDate.of(2000,4,1);
        System.out.println(andereDatum);
        int dagVanHetJaar = vandaag.getDayOfYear();
        System.out.println(dagVanHetJaar);
    }
}