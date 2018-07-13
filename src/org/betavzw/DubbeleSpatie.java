package org.betavzw;

import java.util.Scanner;

public class DubbeleSpatie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String tekst = input.nextLine();

        while (tekst.contains("  ")) {
            tekst = tekst.replace("  ", " ");

        }

        System.out.println("Dit is een nieuwe tekst: " + tekst);
    }
}
