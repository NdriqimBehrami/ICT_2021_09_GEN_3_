package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class VijushmeriaEStudentit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numriOreve = 80;
        System.out.print("Shkruani emrin dhe mbiemrin ju lutem: ");
        String emri = reader.nextLine();
        System.out.print("Shkruani numrin e oreve per lende: ");
        int numriOreveTeLendes = reader.nextInt();
        System.out.print("Shkruani numrin e oreve qe ju keni ndjekur: ");
        int numriOreveTeMbajtura = reader.nextInt();
        int pjesmarrjaNeLend = (numriOreveTeMbajtura * 100) / numriOreveTeLendes;
        System.out.println("Pjesmarrja juaj ne kete semester eshte: " + pjesmarrjaNeLend + "%");
        if (pjesmarrjaNeLend > 49 && pjesmarrjaNeLend !=100){
            System.out.println("Ju i plotsoni kushtet per provim");
        }
        else if (pjesmarrjaNeLend == 100){
            System.out.println("Ju keni 10 pike bonus per lenden");
        }
        else{

            System.out.println("Ju nuk i plotsoni kushtet per provim");
        }
    }
}
