package ict.kosovo.growth_.basic.ora_6;

import java.util.Scanner;

public class ArrayOfNElementsFromUser {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje numer qe deshironi per vargun tuaj: ");
        int numri = reader.nextInt();
        int N[] = new int[numri];
        for (int i = 0; i < numri; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println(N[i] + random);



        }
    }
}
