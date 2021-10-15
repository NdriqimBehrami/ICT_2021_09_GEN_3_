package ict.kosovo.growth_.oop.inheritance_part1.payrollsystem;

public class Consultant extends HourlyEmployee{
    public Consultant(int id, String name, String surname,int hours,double hourlyWage) {
        super(id, name, surname,hours,hourlyWage);
    }
    @Override
    public String toString(){
        return super.toString()+ "\nTitulli punes: Consultant";
    }
}
