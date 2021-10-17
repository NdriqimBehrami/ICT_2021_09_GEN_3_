package ict.kosovo.growth_.oop.ushtrime_vehicle;

public class Car2Door extends Car{
    private int numriDyerve;
    private int numriUlseve;

    public Car2Door(String ngjyra, String modeli, int vitiProdhimit, double cmimi, String llojiKarburantit, double madhsiaMotorrit, int numriDyerve, int numriUlseve) {
        super(ngjyra, modeli, vitiProdhimit, cmimi, llojiKarburantit, madhsiaMotorrit);
        this.numriDyerve = numriDyerve;
        this.numriUlseve = numriUlseve;
    }

    public int getNumriDyerve() {
        return numriDyerve;
    }

    public void setNumriDyerve(int numriDyerve) {
        this.numriDyerve = numriDyerve;
    }

    public int getNumriUlseve() {
        return numriUlseve;
    }

    public void setNumriUlseve(int numriUlseve) {
        this.numriUlseve = numriUlseve;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format("Numri dyerve: %d %n Numri ulseve: %d %n", getNumriDyerve(),getNumriUlseve());
    }
}
