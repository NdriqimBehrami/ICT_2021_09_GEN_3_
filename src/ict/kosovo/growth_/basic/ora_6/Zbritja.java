package ict.kosovo.growth_.basic.ora_6;

public class Zbritja {
    public static void main(String[] args) {
        double x = 10;
        double y = 20;
        System.out.println(zbritja(x,y));

    }

    private static double zbritja(double x, double y) {
        return x < y ? x : y;
    }
}
