package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class TabelaEShumzimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje numer per te gjeneruar tabelen e shumzimit nga 1 deri ne 10");
        int numri = reader.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d %n", numri, i, numri * i);
        }

    }
}
