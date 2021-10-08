package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class Studenti {
    private String emri;
    private String mbiemri;
    private int id;
    private String drejtimi;
    private double notaMesatare;
    private int gjenerata;
    private String lokacioniStudimeve;
   private boolean meKorrospodenc;
    public Studenti(){

    }

    public Studenti(String emri, String mbiemri, int id, String drejtimi, double notaMesatare, int gjenerata, String lokacioniStudimeve, boolean meKorrospodenc) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.id = id;
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
        this.gjenerata = gjenerata;
        this.lokacioniStudimeve = lokacioniStudimeve;
    this.meKorrospodenc = meKorrospodenc;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getEmri() {
        if(emri == null) {
            System.out.println(" Nuk mundeni pa emer ");
        }
        return emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setNotaMesatare(double notaMesatare) {
        this.notaMesatare = notaMesatare;
    }

    public double getNotaMesatare() {
        return notaMesatare;
    }

    public void setGjenerata(int gjenerata) {
        this.gjenerata = gjenerata;
    }

    public int getGjenerata() {
        return gjenerata;
    }

    public void setLokacioniStudimeve(String lokacioniStudimeve) {
        this.lokacioniStudimeve = lokacioniStudimeve;
    }

    public String getLokacioniStudimeve() {
        return lokacioniStudimeve;
    }

    public void setMeKorrospodenc(boolean meKorrospodenc) {
        this.meKorrospodenc = meKorrospodenc;
    }

    public boolean getMeKorrospodenc() {
        return meKorrospodenc;
    }

}

