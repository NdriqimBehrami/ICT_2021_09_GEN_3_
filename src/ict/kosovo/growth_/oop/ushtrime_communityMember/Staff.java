package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class Staff extends Employee{
    public Staff(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi, String pozitaPunes) {
        super(emri, mbiemri, mosha, gjinia, adressa, vendbanimi, pozitaPunes);
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Staf %n");
    }
}
