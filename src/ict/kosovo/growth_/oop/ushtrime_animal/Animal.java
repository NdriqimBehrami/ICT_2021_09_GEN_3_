package ict.kosovo.growth_.oop.ushtrime_animal;

public class Animal {
    private String lloji;
    private String emri;
    private int age;
    private int numriKembeve;
    private String ushqimiPreferuar;
    private String ngjyra;

    public Animal(String lloji, String emri, int age, int numriKembeve, String ushqimiPreferuar, String ngjyra) {
        this.lloji = lloji;
        this.emri = emri;
        this.age = age;
        this.numriKembeve = numriKembeve;
        this.ushqimiPreferuar = ushqimiPreferuar;
        this.ngjyra = ngjyra;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumriKembeve() {
        return numriKembeve;
    }

    public void setNumriKembeve(int numriKembeve) {
        this.numriKembeve = numriKembeve;
    }

    public String getUshqimiPreferuar() {
        return ushqimiPreferuar;
    }

    public void setUshqimiPreferuar(String ushqimiPreferuar) {
        this.ushqimiPreferuar = ushqimiPreferuar;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra() {
        this.ngjyra = ngjyra;
    }


    @Override
    public String toString() {
        return String.format("LLoji: %s %n Emri: %s %n Mosha: %d %n Numri i gjymtyrve: %d %n Ushqimi i preferuar: %s %n Ngjyra: %s %n", getLloji(),getEmri(), getAge(), getNumriKembeve(), getUshqimiPreferuar(), getNgjyra());
    }
}
