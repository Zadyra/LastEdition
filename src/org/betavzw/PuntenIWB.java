package org.betavzw;

import java.util.Scanner;

public class PuntenIWB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef punten voor informatica: ");
        int puntenInformatica = Integer.parseInt(scanner.nextLine());
        while (puntenInformatica > 10 || puntenInformatica < 0) {
            System.out.print("Foute punten, probeer opnieuw voor informatica: ");
            puntenInformatica = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Geef punten voor boekhouden: ");
        int puntenBoekhouden = Integer.parseInt(scanner.nextLine());
        while (puntenBoekhouden > 10 || puntenBoekhouden < 0) {
            System.out.print("Foute punten, probeer opnieuw voor boekhouden: ");
            puntenInformatica = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Geef punten voor wiskunde: ");
        int puntenWiskunde = Integer.parseInt((scanner.nextLine()));
        while (puntenInformatica > 10 || puntenInformatica < 0) {
            System.out.print("Foute punten, probeer opnieuw voor wiskunde: ");
            puntenInformatica = Integer.parseInt(scanner.nextLine());
        }
        int puntenWiskundeEnBoekhouden = puntenWiskunde + puntenBoekhouden;

        if (puntenInformatica >= 7 && puntenWiskundeEnBoekhouden >= 12) {
            System.out.println("Je bent geslaagd");
        } else {
            System.out.println("Je bent niet geslaagd");
            if (puntenInformatica < 7) {
                System.out.println("\tJe had te weinig punten voor informatica");
            }
            if (puntenWiskundeEnBoekhouden < 12) {
                System.out.println("\tJe had te weinig punten voor wiskunde en boekhouden");
            }
        }
    }
}

