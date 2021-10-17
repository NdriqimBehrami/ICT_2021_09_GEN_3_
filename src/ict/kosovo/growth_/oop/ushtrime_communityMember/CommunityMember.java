package ict.kosovo.growth_.oop.ushtrime_communityMember;

public class CommunityMember {
    private String emri;
    private String mbiemri;
    private int mosha;
    private String gjinia;
    private String adressa;
    private String vendbanimi;

    public CommunityMember(String emri, String mbiemri, int mosha, String gjinia, String adressa, String vendbanimi) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.gjinia = gjinia;
        this.adressa = adressa;
        this.vendbanimi = vendbanimi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getGjinia() {
        return gjinia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }

    public String getAdressa() {
        return adressa;
    }

    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }

    public String getVendbanimi() {
        return vendbanimi;
    }

    public void setVendbanimi(String vendbanimi) {
        this.vendbanimi = vendbanimi;
    }

    @Override
    public String toString() {
        return String.format("Emri i plote: %s %s %n Mosha: %d %n Gjinia: %s %n Adressa: %s %n Vendbanimi %s %n ",getEmri(),getMbiemri(),getMosha(),getGjinia(),getAdressa(),getVendbanimi());
    }
}
