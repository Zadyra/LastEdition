package org.betavzw;

import java.util.Scanner;

public class LijstBestemmingen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] bestemmingen = {"de kust", "de zee", "het strand"};
        double[] prijzen = {10.00, 15.00, 12.50};
        System.out.print("Geef je naam: ");
        String naam = input.nextLine();
        int bestemming;
        do {
            System.out.println("Kies een bestemming: ");
            for (int i = 0; i < bestemmingen.length; i++) {
                System.out.printf("\t%d. %s (€%.2f)\n", i + 1, bestemmingen[i], prijzen[i]);
            }
            System.out.print("Welke bestemming kies je (1-3)? ");
            bestemming = Integer.parseInt(input.nextLine());
            if (bestemming < 0 || bestemming > bestemmingen.length) {
                System.out.println("Kies een geldig nummer!");
            }

        } while (bestemming < 1 || bestemming > bestemmingen.length);

        System.out.printf("Dag %s, goede reis naar %s. Dit kost je €%.2f.", naam, bestemmingen[bestemming - 1],
                prijzen[bestemming - 1]);
    }
}
