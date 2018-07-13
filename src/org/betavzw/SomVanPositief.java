package org.betavzw;

import java.util.Scanner;

public class SomVanPositief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int som = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Geef een getal: ");
            int getal = Integer.parseInt(scanner.nextLine());
            while (getal < 0) {

                System.out.println("Geef een positief getal:");
                getal = Integer.parseInt(scanner.nextLine());
            }
            som = som + getal;
            System.out.println("De som van alle positieve getallen: " + som);
        }
    }
}