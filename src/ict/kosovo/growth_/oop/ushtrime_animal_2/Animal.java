package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class Animal {
    private String emer;
    private String ushqimipreferuar;
    private String vendiKuJetojn;
    private int shpejtsiaMaksimale;
    private String ngjyra;
    private boolean egersia;


    public Animal(String emer, String ushqimipreferuar, String vendiKuJetojn, int shpejtsiaMaksimale, String ngjyra,Boolean egersia) {
        this.emer = emer;
        this.ushqimipreferuar = ushqimipreferuar;
        this.vendiKuJetojn = vendiKuJetojn;
        this.shpejtsiaMaksimale = shpejtsiaMaksimale;
        this.ngjyra = ngjyra;
        this.egersia = false;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getUshqimipreferuar() {
        return ushqimipreferuar;
    }

    public void setUshqimipreferuar(String ushqimipreferuar) {
        this.ushqimipreferuar = ushqimipreferuar;
    }

    public String getVendiKuJetojn() {
        return vendiKuJetojn;
    }

    public void setVendiKuJetojn(String vendiKuJetojn) {
        this.vendiKuJetojn = vendiKuJetojn;
    }

    public int getShpejtsiaMaksimale() {
        return shpejtsiaMaksimale;
    }

    public void setShpejtsiaMaksimale(int shpejtsiaMaksimale) {
        this.shpejtsiaMaksimale = shpejtsiaMaksimale;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public boolean isEgersia() {
        return egersia;
    }

    public void setEgersia(boolean egersia) {
        this.egersia = egersia;
    }
    @Override
    public String toString() {
        return String.format("Emri : %s %n Ushqimi i preferuarur: %s %n Shpejtsia maksimale: %d %n Ngjyra: %s %n" +
                "Egersia: %n %n",getEmer(),getUshqimipreferuar(),getShpejtsiaMaksimale(),getNgjyra());
    }
}
