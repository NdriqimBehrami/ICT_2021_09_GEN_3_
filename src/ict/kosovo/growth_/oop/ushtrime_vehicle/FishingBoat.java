package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class FishingBoat extends Boat{
    private String manualeAutomatike;
    private String llojiRrjetes;

    public FishingBoat(String ngjyra, String modeli, int maxPasagjer, double fuqiaAnijes, double madhsiaAnijes, float cmimiAnijes, double shpejtsiaMaksimale, String manualeAutomatike, String llojiRrjetes) {
        super(ngjyra, modeli, maxPasagjer, fuqiaAnijes, madhsiaAnijes, cmimiAnijes, shpejtsiaMaksimale);
        this.manualeAutomatike = manualeAutomatike;
        this.llojiRrjetes = llojiRrjetes;
    }

    public String getManualeAutomatike() {
        return manualeAutomatike;
    }

    public void setManualeAutomatike(String manualeAutomatike) {
        this.manualeAutomatike = manualeAutomatike;
    }

    public String getLlojiRrjetes() {
        return llojiRrjetes;
    }

    public void setRrjeta(String rrjeta) {
        this.llojiRrjetes = llojiRrjetes;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Fishing boat eshte: %s %n Me lloj te rrjetes per peshqim: %s %n ",getManualeAutomatike(),getLlojiRrjetes());
    }
}
