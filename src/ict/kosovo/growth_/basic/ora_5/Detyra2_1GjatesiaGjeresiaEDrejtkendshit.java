package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class Detyra2_1GjatesiaGjeresiaEDrejtkendshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shypni vleren e gjatesise se nje drejtkendshi");
        int gjatesiaDrejtkendshit = reader.nextInt();
        System.out.println("Shtypni vleren e gjeresise se nje drejtkendshi");
        int gjeresiaDrejtkendshit = reader.nextInt();
        if (gjatesiaDrejtkendshit == gjeresiaDrejtkendshit) {
            System.out.println("Ky eshte nje katrore dhe jo drejtkendsh");
        } else {
            System.out.println("Gjatesia e drejtkendshit eshte: " + gjatesiaDrejtkendshit + " dhe gjeresia: " + gjeresiaDrejtkendshit);
        }

    }
}
