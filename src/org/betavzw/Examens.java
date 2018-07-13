package org.betavzw;

import java.util.Scanner;

public class Examens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totaal = 0;
        double gemiddelde;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Geef punten voor examen " + i + ": ");
            int punt = Integer.parseInt(input.nextLine());
            while (punt < 0 || punt > 20) {
                System.out.print("Foute ingave, probeer opnieuw: ");
                punt = Integer.parseInt(input.nextLine());

            }
            totaal = totaal + punt;

        }
        gemiddelde = totaal / 5;
        System.out.println("Het totaal = " + totaal);
        System.out.println("Het gemiddelde = " + gemiddelde);
    }
}
