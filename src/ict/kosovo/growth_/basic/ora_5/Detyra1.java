package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        // Pjesa e pare ku kerkojm nga shfrytzuesi nje tekst
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani nje tekst: ");
        String teksti = reader.nextLine();

        //Pjesa e shfaqjes se programit ku tregon sa karaktere ka teksti
        System.out.println("Numri i Karaktereve per kete tekst eshte: " + teksti.length());
        System.out.println("Shkruaj indeksin nga 0 deri me " + teksti.length() + " per ta paraqitur tesktin nga indexi deri ne fund: ");
        int numriIIndeksit = reader.nextInt();

        // Pjesa per ndarje te stringut nga index deri ne fund
        System.out.println(teksti.substring(numriIIndeksit, teksti.length()));
        String s = teksti.substring(numriIIndeksit, teksti.length());

        //pjesa e ndarjes se tekstit nga indeksi i fillimit deri te i mbarimit dhe shfaqja e tij
        System.out.println("Shkruaj indeksin e fillimit nga 0 deri me " + s.length());
        int numriIFillimitIndeksit = reader.nextInt();
        System.out.println("Shkruaj indeksin e mbarimit nga " + numriIFillimitIndeksit + " deri me: " + s.length());
        int numriIMbarimitIndeksit = reader.nextInt();
        System.out.println(s.substring(numriIFillimitIndeksit, numriIMbarimitIndeksit));

        //Kerkimi i fjales ne tekst a gjindet apo jo
        System.out.println("Shkruani fjalen qe po kerkoni: ");
        String fjala = reader.nextLine();
        reader.nextLine();
        System.out.println("Fjala e dhene: " + fjala + " nuk gjendet ne tekst");
        //
    }
}


