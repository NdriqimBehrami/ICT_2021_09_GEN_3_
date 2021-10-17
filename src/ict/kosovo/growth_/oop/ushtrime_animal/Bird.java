package ict.kosovo.growth_.oop.ushtrime_animal;

public class Bird extends Animal {
    private String tipi;

    public Bird(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra, String tipi) {
        super(lloji, emri, age, numriKembeve, ushqimiPreferuar, ngjyra);
        this.tipi = tipi;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
       return super.toString() + String.format("Tipi: %s %n",getTipi());
    }
}
