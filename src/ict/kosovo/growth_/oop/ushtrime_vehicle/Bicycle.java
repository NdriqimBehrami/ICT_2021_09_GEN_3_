package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class Bicycle extends Vehicle{
    private int madhsia;
    private int numriShpejtsive;

    public Bicycle(String ngjyra, String modeli, int madhsia, int numriShpejtsive) {
        super(ngjyra, modeli);
        this.madhsia = madhsia;
        this.numriShpejtsive = numriShpejtsive;
    }

    public int getMadhsia() {
        return madhsia;
    }

    public void setMadhsia(int madhsia) {
        this.madhsia = madhsia;
    }

    public int getNumriShpejtsive() {
        return numriShpejtsive;
    }

    public void setNumriShpejtsive(int numriShpejtsive) {
        this.numriShpejtsive = numriShpejtsive;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Bicikleta me madhsi: %d %n Me numer te shpejtsive %d %n Lloji i automjetit: Biciklet %n",getMadhsia(),getNumriShpejtsive());

    }
}
