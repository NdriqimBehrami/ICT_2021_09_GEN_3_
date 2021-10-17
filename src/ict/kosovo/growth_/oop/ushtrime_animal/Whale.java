package ict.kosovo.growth_.oop.ushtrime_animal;

public class Whale extends Mammal{
    private int madhsia;
    private int numriDhembeve;

    public Whale(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra, String vendi, int madhsia, int numriDhembeve) {
        super(lloji, emri, age, numriKembeve, ushqimiPreferuar, ngjyra, vendi);
        this.madhsia = madhsia;
        this.numriDhembeve = numriDhembeve;
    }

    public int getMadhsia() {
        return madhsia;
    }

    public void setMadhsia(int madhsia) {
        this.madhsia = madhsia;
    }

    public int getNumriDhembeve() {
        return numriDhembeve;
    }

    public void setNumriDhembeve(int numriDhembeve) {
        this.numriDhembeve = numriDhembeve;
    }
    @Override
    public String toString(){
        return super.toString() + String.format("Madhesia: %d %n Numri dhembeve: %d %n",getMadhsia(),getNumriDhembeve());

    }
}
