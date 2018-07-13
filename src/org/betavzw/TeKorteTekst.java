package org.betavzw;

import java.util.Scanner;

public class TeKorteTekst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef mij een tekst van minstens 8 karakters: ");
        String tekst = input.nextLine();
        int lengte = tekst.length();
        int geprobeerd = 1;
        while (lengte < 8) {
            System.out.print("Kieken, ik zei minstens 8. Opnieuw: ");
            tekst = input.nextLine();
            lengte = tekst.length();
            geprobeerd++;
        }
        if (geprobeerd < 2) {
            System.out.println("Je tekst is \"" + tekst.toUpperCase() + "\"");
        } else {
            System.out.println("Eindelijk ! Je tekst is \"" + tekst.toUpperCase() + "\"");
        }
    }
}
