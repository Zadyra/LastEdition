package org.betavzw;

import java.util.Random;

public class DatumGeneratie {
    public static void main(String[] args) {
        Random rnd = new Random();
        int jaar = rnd.nextInt(31) + 2000;
        int maand = rnd.nextInt(12) + 1;
        int dag;
        switch (maand) {
            case 1:
                dag = rnd.nextInt(31) + 1;
                break;
            case 2:
                if (jaar % 4 == 0) {
                    dag = rnd.nextInt(29) + 1;
                } else {
                    dag = rnd.nextInt(28) + 1;
                }
                break;
            case 3:
                dag = rnd.nextInt(31) + 1;
                break;
            case 4:
                dag = rnd.nextInt(30) + 1;
                break;
            case 5:
                dag = rnd.nextInt(31) + 1;
                break;
            case 6:
                dag = rnd.nextInt(30) + 1;
                break;
            case 7:
                dag = rnd.nextInt(31) + 1;
                break;
            case 8:
                dag = rnd.nextInt(31) + 1;
                break;
            case 9:
                dag = rnd.nextInt(30) + 1;
                break;
            case 10:
                dag = rnd.nextInt(31) + 1;
                break;
            case 11:
                dag = rnd.nextInt(30) + 1;
                break;
            case 12:
                dag = rnd.nextInt(31) + 1;
                break;
            default:
            dag = rnd.nextInt(31)+1;
            break;
        }
        System.out.println(dag + "/" + maand + "/" + jaar);
    }
}
