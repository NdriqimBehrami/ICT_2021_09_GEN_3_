package ict.kosovo.growth_.basic.ora_6;

import java.util.Scanner;


public class TridhjetMetoda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pershendetja();

        VazhdojmMeShembuj();
        int numriPare = 12;
        int numriDyte = 3;
        double numriPareDouble = 15;
        double numriDyteDouble = 5;
        String favouriteTvShow = "Game of thrones";
        int c1 = mbledhja(numriPare, numriDyte);
        System.out.println(numriPare + "+" + numriDyte + "=" + (c1));
        int c2 = zbritja(numriPare, numriDyte);
        System.out.println(numriPare + "-" + numriDyte + "=" + (c2));
        int c3 = shumezimi(numriPare, numriDyte);
        System.out.println(numriPare + "*" + numriDyte + "=" + (c3));
        int c4 = (int) pjestimi(numriPare, numriDyte);
        System.out.println(numriPare + "/" + numriDyte + "=" + (c4));
        int c5 = (int) modulo(numriPare, numriDyte);
        System.out.println(numriPare + "*" + numriDyte + "=" + (c5));
        System.out.println();
        pijkafe();
        System.out.println();
        double c6 = rrenjaKatrore(numriPareDouble);
        System.out.println("Renja katrore e : " + numriPareDouble + " eshte: " + c6);
        int c7 = fuqiaKatrore(numriDyte);
        System.out.println("Fuqia katrore e : " + numriDyte + " eshte: " + c7);
        int c17 = vleraMaksimale(numriPare, numriDyte);
        System.out.println("Vlera maksimale mes: " + numriPare + " dhe " + numriDyte + " eshte " + c17);
        int c18 = vleraMinimale(numriPare, numriDyte);
        System.out.println("Vlera minimale mes: " + numriPare + " dhe " + numriDyte + " eshte " + c18);
        String c20 = QiftTek(numriPare);
        System.out.println("Numri " + numriPare + " eshte numer " + c20);
        String c10 = tvSHow(favouriteTvShow);
        System.out.println("Seriali juaj i preferuar eshte: " + c10);
        System.out.println();
        gymTime();
        System.out.println();
        theend();

    }

    public static void pershendetja() {
        System.out.println("Pershendetje juve ne ICT for Kosovo's Growth");
    }

    public static void VazhdojmMeShembuj() {
        System.out.println("Vazhdojm me disa detyra te mbledhjes,zbritjes,pjestimit,modulimit ");
    }

    public static int mbledhja(int a, int b) {
        return a + b;
    }

    public static int zbritja(int a, int b) {
        return a - b;
    }

    public static int shumezimi(int a, int b) {
        return a * b;
    }

    public static double pjestimi(int a, int b) {
        return a / b;
    }

    public static double modulo(int a, int b) {
        return a % b;
    }

    public static void pijkafe() {
        System.out.println("Nese keni filluar te lodheni athere eshte vetem fillimi dhe pini diqka xD");
    }

    public static double rrenjaKatrore(double a) {
        return Math.sqrt(a);
    }

    public static int fuqiaKatrore(int a) {
        return (int) Math.pow(a, 2);
    }

    public static int vleraMinimale(int a, int b) {
        return Math.min(a, b);
    }

    public static int vleraMaksimale(int a, int b) {
        return Math.max(a, b);
    }


    public static String QiftTek(int a) {
        if (a % 2 == 0) {
            return "Qift";
        } else
            return "Tek";
    }

    public static String tvSHow(String a) {
        if (a == "Game of thrones") {
            return "Game of thrones";
        } else {
            return " you should watch game of thrones";
        }
    }

    public static void gymTime() {
        System.out.println("Duhet te shkoni me shpesh ne fitnes");
    }


    public static void theend() {
        System.out.println("Kaq shpejt u kry a ");
    }


}

