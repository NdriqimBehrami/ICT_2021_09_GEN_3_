package ict.kosovo.growth_.oop.class_and_object_1.detyrat;

public class ProfesoriTest {
    public static void main(String[] args) {
        Profesori prof = new Profesori();
        prof.setEmri("Naim ");
        prof.setMbiemri("Sulejmani");
        prof.setId(1223333);
        prof.setNiveliAkademik("Dr");
        prof.setLokacioniMesimDhenjes("Prishtine");
        prof.setLenda("Programming at java");
        prof.setOretMesimDhenjes(10);


        System.out.printf("Profesori me emrin: %s mbiemer: %s me numer te id-s: %d me nivelin akademik: %s me lokacion ne: %s me" +
                        " lenden: %s dhe me oret e mesimdhenjes: %d %n", prof.getEmri(),
                prof.getMbiemri(), prof.getId(), prof.getNiveliAkademik(),prof.getLokacioniMesimDhenjes(),prof.getLenda(),prof.getOretMesimDhenjes());
    }
}
