package ict.kosovo.growth_.oop.ushtrime_animal;

public class Penguin extends Bird{
    private String vendiPreferuar;
    public Penguin(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra, String tipi, String vendiPreferuar) {
        super(lloji, emri, age, numriKembeve, ushqimiPreferuar, ngjyra, tipi);
        this.vendiPreferuar = vendiPreferuar;
    }

    public String getVendiPreferuar() {
        return vendiPreferuar;
    }

    public void setVendiPreferuar(String vendiPreferuar) {
        this.vendiPreferuar = vendiPreferuar;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Vendi i preferuar per te skijuar: %s %n",getVendiPreferuar());
    }
}
