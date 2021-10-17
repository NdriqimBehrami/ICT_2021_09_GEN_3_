package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class HouseBoat extends Boat{
    private int numriDhomave;

    public HouseBoat(String ngjyra, String modeli, int maxPasagjer, double fuqiaAnijes, double madhsiaAnijes, float cmimiAnijes, double shpejtsiaMaksimale, int numriDhomave) {
        super(ngjyra, modeli, maxPasagjer, fuqiaAnijes, madhsiaAnijes, cmimiAnijes, shpejtsiaMaksimale);
        this.numriDhomave = numriDhomave;

    }

    public int getNumriDhomave() {
        return numriDhomave;
    }

    public void setNumriDhomave(int numriDhomave) {
        this.numriDhomave = numriDhomave;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Anija me numrin e dhomave: %d %n ",getNumriDhomave());
    }
}

