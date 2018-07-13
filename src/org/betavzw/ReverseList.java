package org.betavzw;

import java.util.Scanner;

public class ReverseList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] namen = new String[3];
        for (int i = 0; i < namen.length; i++) {

            System.out.print("Geef naam 1: ");
            String naam = input.nextLine();
            namen[i] = naam;


        }
        for (int counter = namen.length - 1; counter >= 0; counter--) {
            System.out.println(namen[counter]);
        }
    }
}
