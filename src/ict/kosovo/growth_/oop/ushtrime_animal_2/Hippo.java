package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class Hippo extends Animal{
    public Hippo(String emer, String ushqimipreferuar, String vendiKuJetojn, int shpejtsiaMaksimale, String ngjyra, Boolean egersia) {
        super(emer, ushqimipreferuar, vendiKuJetojn, shpejtsiaMaksimale, ngjyra, egersia);
    }
    @Override
    public String toString() {
        return super.toString() + "Hippo";
    }
}
