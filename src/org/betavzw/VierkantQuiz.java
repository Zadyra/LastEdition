package org.betavzw;

import java.util.Scanner;

public class VierkantQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef zijde: ");
        int lengte = Integer.parseInt(input.nextLine());
        for (int kolom = 1; kolom <= lengte; kolom++) {
            System.out.print("*");
        }
            for (int rij = 0; rij < lengte - 2; rij++) {
                System.out.print("*");

            }
            for (int rij = 0; rij < lengte - 2; rij++) {
                System.out.print("*");
            }
                for (int kolom = 1; kolom <= lengte; kolom++) {
                    System.out.print("*");
                }

            }
        }

