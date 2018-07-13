package org.betavzw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Het eerste getal: ");
        int eersteGetal = Integer.parseInt(input.nextLine());
        System.out.print("Het tweede getal: ");
        int tweedeGetal = Integer.parseInt(input.nextLine());
        int eersteOrsp = eersteGetal;
        int tweedeOrsp = tweedeGetal;
        while (eersteGetal != tweedeGetal) {
            if (eersteGetal > tweedeGetal) {
                eersteGetal = eersteGetal - tweedeGetal;
            } else {
                tweedeGetal = tweedeGetal - eersteGetal;
            }

        }
        System.out.println("De kleinste gemeenschappelijke deler van " + eersteOrsp + " en " + tweedeOrsp + " is " + eersteGetal +".");
    }
}