package ict.kosovo.growth_.oop.ushtrime_animal;

public class Dog extends Mammal{
    private int jetGjatsia;

    public Dog(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra, String vendi, int jetGjatsia) {
        super(lloji, emri, age, numriKembeve, ushqimiPreferuar, ngjyra, vendi);
        this.jetGjatsia = jetGjatsia;
    }

    public int getJetGjatsia() {
        return jetGjatsia;
    }

    public void setJetGjatsia(int jetGjatsia) {
        this.jetGjatsia = jetGjatsia;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Jeta gjatesia: %d %n",getJetGjatsia());
    }
}
