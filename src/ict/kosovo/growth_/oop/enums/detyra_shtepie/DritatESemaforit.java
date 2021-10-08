package ict.kosovo.growth_.oop.enums.detyra_shtepie;

public enum DritatESemaforit {
    KUQE("NDALO"), GJELBERT("VAZHDO"), PORTOKALLT("NGADALSO");
    private String levizjetESemaforit;

    public String getLevizjetESemaforit() {
        return this.levizjetESemaforit;
    }
    private DritatESemaforit(String levizjetESemaforit){
        this.levizjetESemaforit = levizjetESemaforit;
    }
}
