package ict.kosovo.growth_.oop.generics.pairs;

public class TestPairOne {
    public static void main(String[] args) {
        Pair<Integer> pairOfInts = new Pair<>(10, 20);
        System.out.println(pairOfInts.getFirst());
        System.out.println(pairOfInts.getSecond());

        pairOfInts = new Pair<>(20, 20);
        Pair<String> pairOfString = new Pair<>("Ndriqim", "Filane");

        System.out.println(pairOfString.getFirst());
        System.out.println(pairOfString.getSecond());

        Pairs<Integer, String> pairOfIS = new Pairs<>(1, "Ndriqim Behrami");
        Pairs<String, Double> borxhli1 = new Pairs<>("Noah", 400.55d);

        Pairs<Integer, Integer> pairOfInts1 = new Pairs<>(10, 20);

        PairOld pairOld = new PairOld(1, "Nasa");
        pairOld = new PairOld("asdasd", 100.9d);
    }
}
