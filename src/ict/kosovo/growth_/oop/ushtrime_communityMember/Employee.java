package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Employee extends CommunityMember{
    private String pozitaPunes;

    public Employee(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, String pozitaPunes) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi);
        this.pozitaPunes = pozitaPunes;
    }

    public String getPozitaPunes() {
        return pozitaPunes;
    }

    public void setPozitaPunes(String pozitaPunes) {
        this.pozitaPunes = pozitaPunes;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Pozita e punes: %s %n",getPozitaPunes());
    }
}
