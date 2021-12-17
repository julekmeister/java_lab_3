public class Mutant {
    protected String imie;
    protected String nazwisko;
    protected String codename;
    protected int powerLevel;

    public Mutant() {
        this.imie = "";
        this.nazwisko = "";
        this.codename = "";
        this.powerLevel = 0;
    }

    public Mutant(String imie, String nazwisko,String codename, int powerLevel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.codename= codename;
        this.powerLevel = powerLevel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    protected int calcPower() {
        return this.powerLevel;
    }

    @Override
    public String toString() {
        return "Mutant: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", kryptonim='" + codename + '\'' +
                ", poziom mocy=" + powerLevel +
                '}';
    }
}
