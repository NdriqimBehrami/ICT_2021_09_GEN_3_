package ict.kosovo.growth_.oop.inheritance_part1.payrollsystem;

public class Manager extends  SalariedEmployee {

    public Manager(int id, String name, String surname, double salary) {
        super(id, name, surname, salary);
    }
    @Override
    public String toString(){
        return super.toString()+ "\nTitulli punes: Menager";
    }
}

