package org.betavzw;

import java.time.LocalDate;
import java.util.Scanner;

public class Future {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate vandaag = LocalDate.now();
        int dagVandaag = vandaag.getDayOfMonth();
        int maandVandaag = vandaag.getMonthValue();
        int jaarVandaag = vandaag.getYear();
        System.out.println("Geef een datum in de toekomst: ");
        System.out.print("Geef jaar: ");
        int jaar = Integer.parseInt(input.nextLine());
        while (jaar < jaarVandaag) {
            System.out.println("Datum moet in de toekomst liggen.");
            System.out.print("Geef jaar: ");
            jaar = Integer.parseInt(input.nextLine());
        }
        System.out.print("Geef maand: ");
        int maand = Integer.parseInt(input.nextLine());
        if (jaar == jaarVandaag) {
            while (maand < maandVandaag ) {
                System.out.println("Datum moet in de toekomst liggen.");
                System.out.print("Geef maand: ");
                maand = Integer.parseInt(input.nextLine());
            }
        }
        System.out.print("Geef dag: ");
        int dag = Integer.parseInt(input.nextLine());
        if (jaar == jaarVandaag && maand == maandVandaag) {
            while (dag <= dagVandaag) {
                System.out.println("Datum moet in de toekomst liggen.");
                System.out.print("Geef een dag: ");
                dag = Integer.parseInt(input.nextLine());
            }


        }
        System.out.println("De datum is " + dag + "/" + maand + "/" + jaar);
    }

}


