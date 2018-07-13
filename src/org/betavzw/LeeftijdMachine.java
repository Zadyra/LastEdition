package org.betavzw;

import java.time.LocalDate;
import java.util.Scanner;

public class LeeftijdMachine {
    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        Scanner input = new Scanner(System.in);
        int leeftijd;
        int dagVandaag = vandaag.getDayOfMonth();
        int maandVandaag = vandaag.getMonthValue();
        int jaarVandaag = vandaag.getYear();
        System.out.print("Geef geboortedag: ");
        int dagGeboorte = Integer.parseInt(input.nextLine());
        System.out.print("Geef geboortemaand: ");
        int maandGeboorte = Integer.parseInt(input.nextLine());
        System.out.print("Geef u geboortejaar: ");
        int jaarGeboorte = Integer.parseInt(input.nextLine());
        leeftijd = jaarVandaag - jaarGeboorte;
        if (maandGeboorte > maandVandaag) {
            leeftijd--;
        } else if (maandGeboorte == maandVandaag && dagGeboorte > dagVandaag) {
            leeftijd--;
        }
        /* LocalDate verjaardag = LocalDate.of(vandaag.getYear(),maand,dag);
        int leeftijd = vandaag.getYear()-jaar;
        if(verjaardag.isAfter(vandaag)){
        leeftijd --;}
         */
        System.out.println("U bent " + leeftijd + " jaar oud.");
    }
}
