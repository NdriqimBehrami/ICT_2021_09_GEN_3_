package ict.kosovo.growth_.basic.ora_6;

import java.util.Scanner;

public class VarguMenyraManuale {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Shenoni numrin e array prej 1 deri ne 10 qe deshironi ta keni dhe pastaj mbushni vlerat: ");

        n=sc.nextInt();

        int[] array = new int[10];
        System.out.println("Shenoni vlerat qe deshironi ti kete ky varg: ");
        for(int i=0; i<n; i++)
        {

            array[i]=sc.nextInt();
        }
        System.out.println("Elementet e vargut jane: ");

        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }
    }
}

