package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class Detyra3PiketNeProvimNota {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni piket tuaj qe keni marre ne provim: ");
        int piket = reader.nextInt();
        if(piket <= 49){
            System.out.println("- nota 5");
        }
        else if(piket ==50 || piket <= 59){
            System.out.println("- nota 6");
        }
        else if (piket ==60 || piket <=69){
            System.out.println("- nota 7");
        }
        else if (piket == 70 || piket <=79){
            System.out.println("- nota 8");
        }
        else if (piket == 80 || piket <=89){
            System.out.println("- nota 9");
        }
        else if (piket ==90 || piket <=100){
            System.out.println("- nota 10");
        }
        else{
            System.out.println("Piket negative nuk lejohen leje shkollen ndersa 100+ he more gjeni ");
        }
    }
}
