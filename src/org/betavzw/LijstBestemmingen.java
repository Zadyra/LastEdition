package org.betavzw;

import java.util.Scanner;

public class LijstBestemmingen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] bestemmingen = {"de kust", "de zee", "het strand"};
        System.out.print("Geef je naam: ");
        String naam = input.nextLine();
        System.out.println("Kies een bestemming: ");
        for (int i = 0; i < bestemmingen.length; i++) {
            System.out.printf("\t%d. %s\n", i + 1, bestemmingen[i]);
        }
        System.out.print("Welke bestemming kies je (1-3)? ");
        int bestemming = Integer.parseInt(input.nextLine());


        System.out.printf("Dag %s, goede reis naar %s.", naam, bestemmingen[bestemming - 1]);


    }
}
