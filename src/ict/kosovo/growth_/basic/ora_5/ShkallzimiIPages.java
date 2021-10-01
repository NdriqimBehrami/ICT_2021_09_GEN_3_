package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class ShkallzimiIPages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni pagen qe merrni: ");
        int paga = reader.nextInt();
        if (paga == 0) {
            System.out.println(paga + "-Pa page");
        } else if (paga > 0 && paga <= 80) {
            System.out.println(paga + "-Social");

        } else if (paga > 80 && paga <= 120) {
            System.out.println(paga + "-Social+ ose pensioner");
        } else if (paga > 120 && paga <= 180) {
            System.out.println(paga + "-Page minimale");
        }else if(paga >180 && paga <=300){
            System.out.println(paga + "-Page mesatare");
        }
        else if (paga > 300 && paga <= 400) {
            System.out.println(paga + "-Page e Mire");
        } else if (paga > 400 && paga <= 600) {
            System.out.println(paga + "-Page mbi mesataren e mire");
        } else {
            System.out.println(paga + " Page e larte * pse po don me lshu Kosoven?");
        }
    }
}
