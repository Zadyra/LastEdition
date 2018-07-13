package org.betavzw;

import java.util.Scanner;

public class FormatTafel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Van welk getal nemen we de tafel? ");
        int getal1 = Integer.parseInt(input.nextLine());
        for (int i = 1; i < 11; i++) {

            String tafel = String.format("%2d x %2d = %3d", i, getal1, getal1 * i);
            System.out.println(tafel);

        }
    }
}
