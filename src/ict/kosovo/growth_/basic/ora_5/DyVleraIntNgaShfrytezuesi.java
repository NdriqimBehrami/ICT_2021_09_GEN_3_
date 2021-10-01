package ict.kosovo.growth_.basic.ora_5;

import java.util.Scanner;

public class DyVleraIntNgaShfrytezuesi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni vleren e pare te nje integeri: ");
        int vleraEPare = reader.nextInt();
        System.out.println("Shtypni vleren e dyte te nje integeri:");
        int vleraEDyte = reader.nextInt();
        if (vleraEPare > vleraEDyte) {
            System.out.println("Vlera me e madhe eshte: " + vleraEPare);
        } else if (vleraEDyte > vleraEPare) {
            System.out.println("Vlera me e madhe eshte: " + vleraEDyte);
        } else {
            System.out.println("Keto dy vlera jane te barabarta");
        }
    }
}
