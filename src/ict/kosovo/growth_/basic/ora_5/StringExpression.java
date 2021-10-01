package ict.kosovo.growth_.basic.ora_5;

public class StringExpression {
    public static void main(String[] args) {
        String emri1 = "Ndriqim";
        String emri2 = "Shkelqim";

        if(emri1.equals(emri2))
            System.out.printf("%s eshte i njejte me %s %n",emri1,emri2);
        else
            System.out.printf("%s nuk eshte i njejte me %s %n",emri1,emri2);

        System.out.println(emri1.compareTo(emri2));
        //per krahasim zakonisht perdoret per sortim
        if(emri1.compareTo(emri2)==0) {
            System.out.println("Jane te njejte");
        }
        else if(emri1.compareTo(emri2)<0) {
            System.out.println("Emri1 eshte para emrit2 ne sortim");
        }
        else {
            System.out.println("Emri2 eshte para emrit1 ne sortim");
        }
    }
}
