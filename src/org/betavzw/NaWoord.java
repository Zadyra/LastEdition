package org.betavzw;

import java.util.Scanner;

public class NaWoord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een woord: ");
        String firstWord = input.nextLine();
        System.out.print("Geef een woord dat alfabetisch na dit woord komt: ");
        String secondWord = input.nextLine();
        while (secondWord.compareTo(firstWord) <= 0) {
            System.out.println("\"" + secondWord + "\" komt niet na \"" + firstWord + "\"");
            System.out.print("Geef een nieuw woord: ");
            secondWord = input.nextLine();
        }
        System.out.println("Inderdaad, \"" + secondWord + "\" komt na \"" + firstWord + "\".");
    }
}
