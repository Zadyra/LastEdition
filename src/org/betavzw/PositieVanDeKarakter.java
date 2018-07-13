package org.betavzw;

import java.util.Scanner;

public class PositieVanDeKarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String tekst = input.nextLine();
        System.out.print("Geef een zoekstest: ");
        String zoekstest = input.nextLine();
        int positie1 = tekst.indexOf(zoekstest);
        int positie2 = tekst.lastIndexOf(zoekstest);
        if (positie1 == positie2 && positie1 > -1) {
            System.out.println("De tekst komt eenmaal voor!");
        } else if (positie1 != positie2 && positie1 > -1) {
            System.out.println("De tekst komt meermaals voor!");
        } else {
            System.out.println("Het zit er geen één keer in!");
        }
    }
}


