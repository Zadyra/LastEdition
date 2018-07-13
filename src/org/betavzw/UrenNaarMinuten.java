package org.betavzw;

import java.util.Scanner;

public class UrenNaarMinuten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef het aantal minuten: ");
        int aantalMinuten = Integer.parseInt(input.nextLine());
        int aantalUren = 0;
        while (aantalMinuten >= 60) {
            aantalMinuten -= 60;
            aantalUren += 1;
        }
        System.out.println("Het aantal uren is " + aantalUren + " en er zijn " + aantalMinuten + " overgebleven.");
    }
}
