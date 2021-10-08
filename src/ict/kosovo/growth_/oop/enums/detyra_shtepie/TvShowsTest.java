package ict.kosovo.growth_.oop.enums.detyra_shtepie;

public class TvShowsTest {
    public static void main(String[] args) {
        TvShows tvsh = TvShows.GAMEOFTHRONES;

        switch (tvsh){
            case GAMEOFTHRONES :
                System.out.println("Game of thrones u zgjedh");
                break;
            case BREAKINGBAD:
                System.out.println("Breaking bad u zgjedh");
                break;
            case LUCIFER:
                System.out.println("Lucifer u zgjedh");
                break;
            case SUITS:
                System.out.println("Suits u zgjedh");
            case YOU:
                System.out.println("You u zgjedh");
                break;
            case THEORIGINALS:
                System.out.println("The originals u zgjedh");
            default:
                System.out.println("Spaske shije per tv show!!");
                break;
        }

    }

}
