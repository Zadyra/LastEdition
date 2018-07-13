package org.betavzw;

public class InitialistatieVanGetallen {
    public static void main(String[] args) {
        int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < getallen.length; i++) {


            if (getallen[i] % 2 == 0) {
                System.out.println(getallen[i]);
            }
        }
        for (int even : getallen) {
            if (even % 2 == 0) {
                System.out.println(even);
            }
        }

    }
}
