package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Faculty extends Employee {

    private int vitiAkademik;

    public Faculty(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, String pozitaPunes, int vitiAkademik) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi, pozitaPunes);

        this.vitiAkademik = vitiAkademik;
    }

    public int getVitiAkademik() {
        return vitiAkademik;
    }

    public void setVitiAkademik(int vitiAkademik) {
        this.vitiAkademik = vitiAkademik;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Viti akademik: %d %n",getVitiAkademik());
    }
}
