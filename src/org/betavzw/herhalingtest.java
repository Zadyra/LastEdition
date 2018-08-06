package org.betavzw;

import java.util.Scanner;

public class herhalingtest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hoeveel namen wil je geven? ");
        int aantalPers = Integer.parseInt(input.nextLine());
        String[] namen = new String[aantalPers];
        int[] punten = new int[aantalPers];
        for (int i = 0; i < namen.length; i++) {
            System.out.print("Geef naam " + (i + 1) + ": ");
            namen[i] = input.nextLine();

        }
        for (int i = 0; i < namen.length; i++) {
            System.out.print("Geef punten voor " + namen[i] + " : ");
            punten[i] = Integer.parseInt(input.nextLine());
            while (punten[i] < 0 || punten[i] > 20) {
                System.out.println("Fout, kieken. Tussen 0 en 20.");
                System.out.print("Geef punten voor " + namen[i] + " : ");
                punten[i] = Integer.parseInt(input.nextLine());
            }

        }
        String[]sterren = new String[aantalPers];
        sterren[0]= Integer.parseInt("*")*punten[0];
        for (String naam : namen) {
            System.out.printf("%10s :%s", naam, );

        }
    }

}
