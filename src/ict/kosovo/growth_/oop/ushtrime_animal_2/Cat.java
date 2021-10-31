package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class Cat extends Animal{

    public Cat(String emer, String ushqimipreferuar, String vendiKuJetojn, int shpejtsiaMaksimale, String ngjyra, Boolean egersia) {
        super(emer, ushqimipreferuar, vendiKuJetojn, shpejtsiaMaksimale, ngjyra, egersia);
    }
    @Override
    public String toString() {
        return super.toString() + "Cat";
    }
}
