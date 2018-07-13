package org.betavzw;

import java.util.Scanner;

public class BrutoLoon2 {
    static final double URENPERDAG = 7.6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef de totaal gewerkte uren: ");
        double urenGewerkt = Double.parseDouble(input.nextLine());
        System.out.print("Wat is uw uurloon: ");
        double uurLoon = Double.parseDouble(input.nextLine());
        double overUren;
        if (urenGewerkt > URENPERDAG) {
            overUren = urenGewerkt - URENPERDAG;
            urenGewerkt = URENPERDAG;
        } else {
            overUren = 0;
        }
        double loon = urenGewerkt * uurLoon + overUren * uurLoon * 1.5;
        System.out.println("Uw loon : €" + loon);


    }
}
