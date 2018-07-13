package org.betavzw;

import java.util.Random;
import java.util.Scanner;

public class RaadHetGetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int getal = rnd.nextInt(100) + 1;
        System.out.print("Raad een getal tussen 1 en 100: ");
        int gekozenGetal = Integer.parseInt(input.nextLine());
        int aantalPogingen = 1;
        while (gekozenGetal != getal) {
            if (gekozenGetal > getal) {
                System.out.println("Lager");
                System.out.print("Raad een getal tussen 1 en 100: ");
                gekozenGetal = Integer.parseInt(input.nextLine());
                aantalPogingen++;
            } else {
                System.out.println("Hoger");
                System.out.print("Raad een getal tussen 1 en 100: ");
                gekozenGetal = Integer.parseInt(input.nextLine());
                aantalPogingen++;
            }
        }
        System.out.println("Aantal pogingen: " + aantalPogingen);
    }
}
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();
    int getal = rnd.nextInt(100) + 1;
    boolean gevonden = false;
    int beurten = 0;
    while (!gevonden){
        beurten++;
        System.out.print("Raad een getal tussen 1 en 100: ");
        int raden = Integer.parseInt(scanner.nextLine());
        if (getal > raden){
            System.out.println("Hoger");
        } else if (getal < raden){
            System.out.println("Lager");
        }else{
            gevonden = true;
        }
    }
    System.out.println("Het getal is gevonden in " + beurten + " beurten");
}*/