package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class BasketBallPlayerTest {
    public static void main(String[] args) {
        BasketBallPlayer newplayer = new BasketBallPlayer();
        newplayer.setEmri("Lebron");
        newplayer.setMbiemri("James");
        newplayer.setNumri(23);
        newplayer.setEkipiLuajtes("Lakers");
        newplayer.setGjatsia(2.07);
        newplayer.setPreciziteti(9.9);
        newplayer.setKercimiLart(3.2);
        newplayer.setShpejtsia(8.2);
        newplayer.setPozita("Sulm ");
        newplayer.setShitja(50);
        System.out.printf("Lojtari %s %s me numrin %d ne ekipin %s %n me gjatsi %.2f dhe precizitet %.2f me kercim lart %.2f %n"  +
                "me shpejtsi per meter %.2f ne poziten ku luan %s qe ne shitje doli me cmimin ne miliomn %d %n",newplayer.getEmri(),newplayer.getMbiemri()
        ,newplayer.getNumri(),newplayer.getEkipiLuajtes(),newplayer.getGjatsia(),newplayer.getPreciziteti(),newplayer.getKercimiLart(),newplayer.getShpejtsia()
        ,newplayer.getPozita(),newplayer.getShitja());
    }

}
