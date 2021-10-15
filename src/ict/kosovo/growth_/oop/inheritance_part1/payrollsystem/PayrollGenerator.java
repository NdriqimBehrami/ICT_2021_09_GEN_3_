package ict.kosovo.growth_.oop.inheritance_part1.payrollsystem;

public class PayrollGenerator extends Employee {
    private double pagesaPerOre;
    private double oretEPunuara;


    public PayrollGenerator(int id, String name, String surname, double pagesaPerOre, double oretEPunuara) {
        super(id, name, surname);
        this.pagesaPerOre = pagesaPerOre;
        this.oretEPunuara = oretEPunuara;
    }

    public double getPagesaPerOre() {
        return pagesaPerOre;
    }


    public void setOretEPunuara(double oretEPunuara) {
        this.oretEPunuara = oretEPunuara;
    }
}



