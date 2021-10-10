package ict.kosovo.growth_.oop.ushtrime3.ToDoDetyra;

public class PixelTest {
    public static void main(String[] args) {
        Pixel vetura1 = new Pixel(41.40338, 2.17403,"kuqe");
        Pixel vetura2 = new Pixel(6.13303, 36.55510,"gjelbert");

        System.out.printf("Distance eshte: %.3f %s", vetura1.distantTo(vetura2), vetura1.getDistance());
        System.out.println();
        System.out.println("Koordinatat per veteuren e pare jane: " +vetura1.getgpsCoordinates());
        System.out.printf("Koordinatat e dy veturave jane: %.2f --- %.2f %n",vetura1.getgpsCoordinates(),vetura2.getgpsCoordinates());
        System.out.println("Distanca ndermjet vetures se pare me ngjyre te " + vetura1.getNgjyra()+" dhe vetures se dyte me ngjyre te "+ vetura2.getNgjyra()+ " eshte: "+vetura1.distantTo(vetura2));
        System.out.println("ngjyra eshte "+ vetura1.getNgjyra());
    }
}
