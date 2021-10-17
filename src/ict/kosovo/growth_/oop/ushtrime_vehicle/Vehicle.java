package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class Vehicle {
    private String ngjyra;
    private String modeli;

    public Vehicle(String ngjyra, String modeli) {
        this.ngjyra = ngjyra;
        this.modeli = modeli;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    @Override
    public String toString() {
        return String.format("Automjeti me ngjyren: %s %n  Modeli : %s %n",getNgjyra(),getModeli());
    }
}
