package ict.kosovo.growth_.oop.ushtrime_animal_2;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rexi","Kocke","Default",30,"Kuqe",true);
        Hippo hipo1 = new Hippo("hippoua","Fish","Detra",10,"Zeze",false);
        Lion lion1 = new Lion("Lioni","mish","Jungle",90,"Portokallt",true);

        System.out.println(dog1);
        System.out.println("--------------------------");
        System.out.println(hipo1);
        System.out.println("--------------------------");
        System.out.println(lion1);
    }
}
