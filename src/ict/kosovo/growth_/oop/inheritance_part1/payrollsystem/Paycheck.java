package ict.kosovo.growth_.oop.inheritance_part1.payrollsystem;

public class Paycheck extends Employee {
    private Employee puntori;
    private int shuma;
    private int oretEPunes;
    private double pagesaNeOre;

    public Paycheck(int id, String name, String surname, Employee puntori, int id1, int shuma, int oretEPunes, double pagesaNeOre) {
        super(id, name, surname);
        this.shuma = shuma;
        this.oretEPunes = oretEPunes;
        this.pagesaNeOre = pagesaNeOre;
    }

    @Override
    public String toString() {
        return String.format(" Me shumen: %dEUR %n Me oret e punes: %d %n Me pagesen e ores: %.2f EUR "
                ,shuma,oretEPunes,pagesaNeOre);
    }
}
