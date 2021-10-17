package ict.kosovo.growth_.oop.ushtrime_animal;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("pitbull","tedy",3,4,"Kocke","Zeze","Kosove",3);
        Whale whale1 = new Whale("balene","balenablu",25,0,"Fish","bardh e zi","Oqean",200,24);
        Parrot parrot1 = new Parrot("parrot","Fiu",2,2,"krimbe","portokallt","Fluturues","nqiell");
        Penguin penguin1 = new Penguin("penguin","lea",7,2,"fish","bardh e zi","kembsore","Akullnaja");

        System.out.println(dog1);
        System.out.println("----------------------------------");
        System.out.println(whale1);
        System.out.println("----------------------------------");
        System.out.println(parrot1);
        System.out.println("----------------------------------");
        System.out.println(penguin1);

    }
}
