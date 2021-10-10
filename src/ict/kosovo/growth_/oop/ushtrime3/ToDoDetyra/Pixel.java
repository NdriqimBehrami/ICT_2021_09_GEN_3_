package ict.kosovo.growth_.oop.ushtrime3.ToDoDetyra;

import ict.kosovo.growth_.oop.ushtrime3.DistanceUnit;

public class Pixel {
    private double x;
    private double y;
    private double lattiude;
    private double longitude;
    private double zoom;
    private DistanceUnit distance;
    private String ngjyra;

    public Pixel (double x, double y,String ngjyra){
        this.x = x;
        this.y = y;
        this.ngjyra=ngjyra;
        this.distance = DistanceUnit.KM;
    }

    public int getX() {
        return (int) x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return (int) y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DistanceUnit getDistanca() {
        return distance;
    }

    public void setDistanca(DistanceUnit distanca) {
        this.distance = distance;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public double distantTo(Pixel vetura2){
        double distance = Math.toRadians(y - x);
        return distance;

    }

    public DistanceUnit getDistance() {
        return distance;
    }


    public double getgpsCoordinates() {
        double koordinata =  Math.cos(Math.toRadians(x))
                * Math.cos(Math.toRadians(y))
                * Math.cos(Math.toRadians((y) - (x)))
                + Math.sin(Math.toRadians(x))
                * Math.sin(Math.toRadians(y));
        return koordinata;
    }
}

