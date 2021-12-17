public class Osoba {
    protected String imie;
    protected String nazwisko;
    private boolean isMutant;

    public Osoba(String imie, String nazwisko, boolean isMutant) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.isMutant = isMutant;
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

    public boolean isMutant() {
        return isMutant;
    }

    public void setMutant(boolean mutant) {
        isMutant = mutant;
    }




    @Override
    public String toString() {
        return "Osoba: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", isMutant='" + (isMutant ? "Tak" : "Nie") + '}';
    }
}
