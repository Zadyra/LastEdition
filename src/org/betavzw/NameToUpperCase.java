package org.betavzw;

import java.util.Scanner;

public class NameToUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef je naam: ");
        String naam1 = input.nextLine();
        String naamUppe = naam1.toUpperCase();
        System.out.println("Dag " + naamUppe);
    }
}
