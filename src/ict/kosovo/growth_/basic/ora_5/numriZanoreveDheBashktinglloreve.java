package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class numriZanoreveDheBashktinglloreve {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje tekst per te ditur numrin e zanoreve dhe bashktinglloreve: ");
        String teksti = reader.nextLine();

        teksti = teksti.toLowerCase();
        int zanore = 0;
        int bashktingllore = 0;

        for (int i = 0; i < teksti.length(); i++)

            if (teksti.charAt(i) == 'a' || teksti.charAt(i) == 'e' || teksti.charAt(i) == 'i' || teksti.charAt(i) == 'o' || teksti.charAt(i) == 'u') {

                zanore++;
            } else if (teksti.charAt(i) >= 'a' && teksti.charAt(i) <= 'z') {

                bashktingllore++;
            }
            System.out.println("Numri i zanoreve per kete tekst eshte: "+ zanore);
            System.out.println("Ndersa numri i bashktinglloreve eshte: "+bashktingllore);
        }
    }

