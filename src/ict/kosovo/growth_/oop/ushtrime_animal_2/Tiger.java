package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class Tiger extends Animal{
    public Tiger(String emer, String ushqimipreferuar, String vendiKuJetojn, int shpejtsiaMaksimale, String ngjyra, Boolean egersia) {
        super(emer, ushqimipreferuar, vendiKuJetojn, shpejtsiaMaksimale, ngjyra, egersia);
    }
    @Override
    public String toString() {
        return super.toString() + "Tiger";
    }
}
