package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class NumratPrej1DeriNeN {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje numer prej 1 deri ku deshironi: ");
        int numri = reader.nextInt();
        for (int i = 1; i <= numri; i++) {
            System.out.println("Numri : " + i);
            System.out.println("Katrori i numrit " + i + " eshte:" + i * i);
            System.out.println("Kubi i numrit " + i + " eshte:" + i * i * i);
            System.out.println("Rrenja katrore e numrit " + i + " eshte: " + Math.sqrt(i));
            System.out.println("---------------------------------");

        }


    }
}
