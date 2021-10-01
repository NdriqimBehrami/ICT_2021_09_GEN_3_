package ict.kosovo.growth_.basic.ora_5;
import java.util.Scanner;
public class Detyra1Semafori {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shtypni nje numer per te ditur gjendjen e semaforit: ");
        int numri = reader.nextInt();
        if (numri == 1){
            System.out.println("Semafori eshte i kuq");
        }
        else if (numri ==2){
            System.out.println("Semafori eshte i verdhe");
        }
        else if (numri ==3){
            System.out.println("Semafori eshte i gjelbert");
        }
        else {
            System.out.println("Semafori nuk eshte i leshuar fare (mungon rryma)");
        }
    }
}
