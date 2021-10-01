package ict.kosovo.growth_.basic.ora_5;

import java.util.*;

public class Detyra1_4NumriNeRangunEDhene {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje numer te rastesishem: ");
        int numri = reader.nextInt();
        if (numri >= -10000 && numri <= 10000){
            System.out.println("Numri eshte ne vargun e dhene");
        }
        else {
            System.out.println("Numri nuk eshte ne vargun e dhene");
        }
        }
}
