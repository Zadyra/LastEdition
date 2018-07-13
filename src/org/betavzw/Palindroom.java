package org.betavzw;

import java.util.Scanner;

public class Palindroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef een palindroom: ");
        String palindroom = input.nextLine();
        int lengteVanPali = palindroom.length();
        boolean isEenPali = false;
        int plaatsVanachteren = lengteVanPali - 1;
        for (int plaats = 0; plaats < lengteVanPali; plaats++) {
            if (palindroom.charAt(plaats) == palindroom.charAt(plaatsVanachteren)) {
                isEenPali = true;
                plaatsVanachteren = plaatsVanachteren - 1;
            } else {
                isEenPali = false;
                break;
            }
        }
        if (isEenPali) {
            System.out.println("Het is een palindroom ! ");
        } else {
            System.out.println("Het is geen palindroom !");
        }
    }
}