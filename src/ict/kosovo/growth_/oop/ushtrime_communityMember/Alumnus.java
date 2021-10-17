package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Alumnus extends CommunityMember {
    private int id;
    private String universiteti;
    private String drejtimi;
    private double notaMesatare;
    private int vitiMbarimitTstudimeve;

    public Alumnus(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, int id, String universiteti, String drejtimi, double notaMesatare, int vitiMbarimitTstudimeve) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi);
        this.id = id;
        this.universiteti = universiteti;
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
        this.vitiMbarimitTstudimeve = vitiMbarimitTstudimeve;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversiteti() {
        return universiteti;
    }

    public void setUniversiteti(String universiteti) {
        this.universiteti = universiteti;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public double getNotaMesatare() {
        return notaMesatare;
    }

    public void setNotaMesatare(double notaMesatare) {
        this.notaMesatare = notaMesatare;
    }

    public int getVitiMbarimitTstudimeve() {
        return vitiMbarimitTstudimeve;
    }

    public void setVitiMbarimitTstudimeve(int vitiMbarimitTstudimeve) {
        this.vitiMbarimitTstudimeve = vitiMbarimitTstudimeve;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Id: %d %n Universiteti: %s %n Drejtimi: %s %n Nota mesatare: %.2f %n Viti i mbarimit te studimeve: %d %n", getId(), getUniversiteti(), getDrejtimi(), getNotaMesatare(), getVitiMbarimitTstudimeve());

    }
}
