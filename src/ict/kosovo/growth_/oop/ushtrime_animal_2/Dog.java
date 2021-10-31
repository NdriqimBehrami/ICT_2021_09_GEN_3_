package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class Dog extends Animal{
    public Dog(String emer, String ushqimipreferuar, String vendiKuJetojn, int shpejtsiaMaksimale, String ngjyra, Boolean egersia) {
        super(emer, ushqimipreferuar, vendiKuJetojn, shpejtsiaMaksimale, ngjyra, egersia);
    }
    @Override
    public String toString() {
        return super.toString() + "Dog";
    }
}
