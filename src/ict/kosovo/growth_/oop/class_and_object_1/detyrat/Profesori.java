package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class Profesori {
    private String emri;
    private String mbiemri;
    private int id;
    private String niveliAkademik;
    private String lokacioniMesimDhenjes;
    private String lenda;
    private int oretMesimDhenjes;

    public Profesori (){
        /////
    }


    public Profesori(String emri, String mbiemri, int id, String niveliAkademik, String lokacioniStudimeve, String lenda, int oretMesimDhenjes) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
        this.niveliAkademik = niveliAkademik;
        this.lokacioniMesimDhenjes = lokacioniStudimeve;
        this.lenda = lenda;
        this.oretMesimDhenjes = oretMesimDhenjes;

    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNiveliAkademik() {
        return niveliAkademik;
    }

    public void setNiveliAkademik(String niveliAkademik) {
        this.niveliAkademik = niveliAkademik;
    }

    public String getLokacioniMesimDhenjes() {
        return lokacioniMesimDhenjes;
    }

    public void setLokacioniMesimDhenjes(String lokacioniMesimDhenjes) {
        this.lokacioniMesimDhenjes = lokacioniMesimDhenjes;
    }

    public String getLenda() {
        return lenda;
    }

    public void setLenda(String lenda) {
        this.lenda = lenda;
    }

    public int getOretMesimDhenjes() {
        return oretMesimDhenjes;
    }

    public void setOretMesimDhenjes(int oretMesimDhenjes) {
        this.oretMesimDhenjes = oretMesimDhenjes;
    }
}
