package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Student extends CommunityMember{
    private int id;
    private String universiteti;
    private String drejtimi;
    private double notaMesatare;

    public Student(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, int id, String universiteti, String drejtimi, double notaMesatare) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi);
        this.id = id;
        this.universiteti = universiteti;
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
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

    @Override
    public String toString() {
        return super.toString() + String.format("Id: %d %n Universiteti: %s %n Drejtimi: %s %n Nota Mesatare %.2f %n",getId(),getUniversiteti(),getDrejtimi(),getNotaMesatare());
    }
}
