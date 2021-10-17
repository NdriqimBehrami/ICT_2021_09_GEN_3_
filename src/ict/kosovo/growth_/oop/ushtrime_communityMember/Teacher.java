package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Teacher extends Faculty{


    public Teacher(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, String pozitaPunes, int vitiAkademik) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi, pozitaPunes, vitiAkademik);
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Teacher %n");
    }
}
