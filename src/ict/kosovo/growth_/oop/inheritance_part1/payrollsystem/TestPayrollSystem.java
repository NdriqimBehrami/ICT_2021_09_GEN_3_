package ict.kosovo.growth_.oop.inheritance_part1.payrollsystem;

public class TestPayrollSystem {
    public static void main(String[] args) {
        Employee puntori1 = new Consultant(25000, "Ndriqim", "Behrami", 50, 8.20);
        Employee puntori2 = new Programmer(25566, "Latif", "Latifi", 650);

        System.out.println(puntori1);
        System.out.println("------------------------------");
        System.out.println(puntori2);
        System.out.println("------------------------------");
        Paycheck puntorit1 = new Paycheck(25000, "Ndriqim", "Behrami", puntori1,
                25555, 550, 50, 4.8);
        System.out.println(puntorit1);
        System.out.println("------------------------------");

        PayrollGenerator puntorit2 = new PayrollGenerator(25550, "Ndriqim", "Behrami", 27.5, 48);
        System.out.println(puntorit2);
        System.out.println("------------------------------");

        Employee puntori5 = new Secretary(25443,"Filane","Fisteku",38,12.60);
        System.out.println(puntori5);
        System.out.println("------------------------------");
        Employee puntori6 = new Manager(25661,"Cristiano","Ronaldo",25000);
        System.out.println(puntori6);


    }
}