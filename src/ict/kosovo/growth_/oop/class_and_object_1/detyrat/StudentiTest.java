package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class StudentiTest {
    public static void main(String[] args) {
        Studenti account = new Studenti();
        account.setEmri("Ndriqim");
        account.setMbiemri("Behrami");
        account.setId(171841735);
        account.setDrejtimi("Shkenca Kompjuterike");
        account.setGjenerata(2018);
        account.setNotaMesatare(8.6);
        account.setLokacioniStudimeve("Prishtine");
        account.setMeKorrospodenc(false);

        System.out.printf("Studenti me emrin: %s mbiemer: %s me numer te id-s: %d me drejtimin: %s te gjenerates: %d me" +
                        " note mesatare: %.2f dhe me lokacion ne: %s %n", account.getEmri(),
                account.getMbiemri(), account.getId(), account.getDrejtimi(), account.getGjenerata(), account.getNotaMesatare(),
                account.getDrejtimi());
        Studenti.hyProvim();
        Studenti.bursa(8.6);
    }


}
