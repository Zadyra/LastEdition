package org.betavzw;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int antwoord;
        do {
            System.out.println("Wilt u: ");
            System.out.println("\t1. Twee getallen optellen.");
            System.out.println("\t2. Twee getallen aftrekken.");
            System.out.println("\t0. Stoppen.");
            System.out.print("Uw antwoord: ");
            antwoord = Integer.parseInt(input.nextLine());
            switch (antwoord) {
                case 0:
                    System.out.println("Exit program!");
                    break;
                case 1:
                    System.out.print("Geef het eerste getal: ");
                    int eersteGetal = Integer.parseInt(input.nextLine());
                    System.out.print("Geef het tweede getal: ");
                    int tweedeGetal = Integer.parseInt(input.nextLine());
                    int optelling = eersteGetal + tweedeGetal;
                    System.out.println(eersteGetal + " + " + tweedeGetal + " = " + optelling);
                    break;
                case 2:
                    System.out.print("Geef het eerste getal: ");
                    eersteGetal = Integer.parseInt(input.nextLine());
                    System.out.print("Geef het tweede getal: ");
                    tweedeGetal = Integer.parseInt(input.nextLine());
                    int aftrekking = eersteGetal + tweedeGetal;
                    System.out.println(eersteGetal + " - " + tweedeGetal + " = " + aftrekking);
                    break;
                default:
                    System.out.println("Wrong command!");
                    break;


            }
        } while (antwoord != 0);
    }
}

