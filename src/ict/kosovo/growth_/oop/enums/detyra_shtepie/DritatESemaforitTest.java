package ict.kosovo.growth_.oop.enums.detyra_shtepie;

public class DritatESemaforitTest {
    public static void main(String[] args) {
        DritatESemaforit[] dritat= DritatESemaforit.values();
        for (DritatESemaforit drita : dritat){
            System.out.println("Drita e " + drita.name()+": "+ drita.getLevizjetESemaforit());
        }
    }
}
