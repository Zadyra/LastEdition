package org.betavzw;

import java.util.Scanner;

public class StringNameFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Geef een naam: ");
            String naam = input.nextLine();
            System.out.printf("Naam: %10s", naam);

        }
    }

