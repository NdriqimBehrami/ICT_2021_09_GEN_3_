package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class Car extends Vehicle{
    private int vitiProdhimit;
    private double cmimi;
    private String llojiKarburantit;
    private double madhsiaMotorrit;

    public Car(String ngjyra, String modeli, int vitiProdhimit, double cmimi, String llojiKarburantit, double madhsiaMotorrit) {
        super(ngjyra, modeli);
        this.vitiProdhimit = vitiProdhimit;
        this.cmimi = cmimi;
        this.llojiKarburantit = llojiKarburantit;
        this.madhsiaMotorrit = madhsiaMotorrit;
    }

    public int getVitiProdhimit() {
        return vitiProdhimit;
    }

    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit = vitiProdhimit;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public String getLlojiKarburantit() {
        return llojiKarburantit;
    }

    public void setLlojiKarburantit(String llojiKarburantit) {
        this.llojiKarburantit = llojiKarburantit;
    }

    public double getMadhsiaMotorrit() {
        return madhsiaMotorrit;
    }

    public void setMadhsiaMotorrit(double madhsiaMotorrit) {
        this.madhsiaMotorrit = madhsiaMotorrit;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Viti i prodhimit: %d %n Cmimi: %.2f %n LLoji i karburantit: %s %n" +
                "Madhsia e motorrit: %.2f %n LLoji i automjetit: Veture %n",getVitiProdhimit(),getCmimi(),getLlojiKarburantit(),getMadhsiaMotorrit());
    }
}
