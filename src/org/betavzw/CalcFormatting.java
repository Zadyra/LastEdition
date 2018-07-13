package org.betavzw;

import java.util.Scanner;

public class CalcFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        double eersteGetal = Double.parseDouble(input.nextLine());
        System.out.print("Geef het tweede getal: ");
        double tweedeGetal = Double.parseDouble(input.nextLine());
        double quotient = eersteGetal / tweedeGetal;
        String back;
        back = String.format("%2.0f / %.0f = %.2f", eersteGetal, tweedeGetal, quotient);
        System.out.print(back);
    }
}
