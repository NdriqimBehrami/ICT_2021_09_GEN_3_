package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class Detyra4LejimiIStudentitNeProvim {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni numrin e oreve te mbajtura: ");
        int oretEMbajtura = reader.nextInt();
        System.out.println("Shtypni numrin e oreve te ndjekura: ");
        int oretENdjekura = reader.nextInt();
        int perqindjaEKlasesSeNdjekur = (oretENdjekura * 100) / oretEMbajtura;
        System.out.println("Perqindja e klases se ndjekur eshte:" + perqindjaEKlasesSeNdjekur);
        if(perqindjaEKlasesSeNdjekur <= 75){
            System.out.println("Nuk ju lejohet te hyni ne provime");
        }
        else {
            System.out.println("Mund te hyni ne provim");
        }
    }
}
