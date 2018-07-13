package org.betavzw;

import java.util.Scanner;

public class WestVlaams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String tekst = input.nextLine();
        char[] letters = tekst.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'g') {
                letters[i] = 'h';

            } else if (letters[i] == 'h') {
                letters[i] = 'g';
            } else if (letters[i] == 'H') {
                letters[i] = 'G';
            } else if (letters[i] == 'G') {
                letters[i] = 'H';
            }
        }
        String vertaald = new String(letters);
        System.out.println("De vertaling is: " + vertaald);
    }
}

