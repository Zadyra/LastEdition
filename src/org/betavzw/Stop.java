package org.betavzw;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een tekst: ");
        String inp = input.nextLine();
        while(!inp.equalsIgnoreCase("stop")){
            System.out.print("Opnieuw: ");
            inp = input.nextLine();

        }
    }
}
