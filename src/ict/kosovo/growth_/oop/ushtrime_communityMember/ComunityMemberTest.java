package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class ComunityMemberTest {
    public static void main(String[] args) {
        Student studenti1 = new Student("Ndriqim", "Behrami", 24, "Mashkull", "Kongresi i Manastritit", "Dubai", 27455, "UBT", "SHKI", 8.6);
        Teacher teacher1 = new Teacher("latif", "Latifi", 34, "MAshkull", "TEst", "Test", "Teacher", 2021);
        Alumnus alumnus1 = new Alumnus("john", "Snow", 22, "Mashkull", "tstesss", "test", 26446, "Teknik", "telekomunikacion", 9.5, 2019);

        System.out.println(studenti1);
        System.out.println("------------------------------------");
        System.out.println(teacher1);
        System.out.println("------------------------------------");
        System.out.println(alumnus1);

    }


}
