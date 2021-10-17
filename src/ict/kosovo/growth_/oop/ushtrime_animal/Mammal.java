package ict.kosovo.growth_.oop.ushtrime_animal;

public class Mammal extends Animal{
    private String vendi;

    public Mammal(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra, String vendi) {
        super(lloji, emri, age, numriKembeve, ushqimiPreferuar, ngjyra);
        this.vendi = vendi;
    }

    public String getVendi() {
        return vendi;
    }

    public void setVendi(String vendi) {
        this.vendi = vendi;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Vendi ku ky mammal ekziston: %s %n",getVendi());
    }
}
