package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class Boat extends Vehicle{
    private int maxPasagjer;
    private double fuqiaAnijes;
    private double madhsiaAnijes;
    private double cmimiAnijes;
    private double shpejtsiaMaksimale;

    public Boat(String ngjyra, String modeli, int maxPasagjer, double fuqiaAnijes, double madhsiaAnijes, double cmimiAnijes, double shpejtsiaMaksimale) {
        super(ngjyra, modeli);
        this.maxPasagjer = maxPasagjer;
        this.fuqiaAnijes = fuqiaAnijes;
        this.madhsiaAnijes = madhsiaAnijes;
        this.cmimiAnijes = cmimiAnijes;
        this.shpejtsiaMaksimale = shpejtsiaMaksimale;
    }

    public int getMaxPasagjer() {
        return maxPasagjer;
    }

    public void setMaxPasagjer(int maxPasagjer) {
        this.maxPasagjer = maxPasagjer;
    }

    public double getFuqiaAnijes() {
        return fuqiaAnijes;
    }

    public void setFuqiaAnijes(double fuqiaAnijes) {
        this.fuqiaAnijes = fuqiaAnijes;
    }

    public double getMadhsiaAnijes() {
        return madhsiaAnijes;
    }

    public void setMadhsiaAnijes(double madhsiaAnijes) {
        this.madhsiaAnijes = madhsiaAnijes;
    }

    public double getCmimiAnijes() {
        return cmimiAnijes;
    }

    public void setCmimiAnijes(float cmimiAnijes) {
        this.cmimiAnijes = cmimiAnijes;
    }

    public double getShpejtsiaMaksimale() {
        return shpejtsiaMaksimale;
    }

    public void setShpejtsiaMaksimale(double shpejtsiaMaksimale) {
        this.shpejtsiaMaksimale = shpejtsiaMaksimale;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Numri maksimal i pasagjerve: %d %n Fuqija e anijes: %.2f %n " +
                "Madhsia e anijes: %.2f %n Cmimi i anijes: %.2f %n Shpejtsia maksimale e anijes: %.2f %n LLoji i automjetit: Anije %n",getMaxPasagjer(),getFuqiaAnijes(),getMadhsiaAnijes(),getCmimiAnijes(),getShpejtsiaMaksimale());
    }
}
