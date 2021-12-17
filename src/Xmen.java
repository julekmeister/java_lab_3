public class Xmen extends Mutant{
    protected int powerMod;

    public Xmen() {
        super();
        this.powerMod=0;
    }

    public Xmen(int powerMod) {
        this.powerMod = powerMod;
    }

    public Xmen(String imie, String nazwisko, String codename, int powerLevel, int powerMod) {
        super(imie, nazwisko, codename, powerLevel);
        this.powerMod = powerMod;
    }

    @Override
    protected int calcPower() {
        return super.calcPower()+powerMod;
    }

    public int getPowerMod() {
        return powerMod;
    }

    public void setPowerMod(int powerMod) {
        this.powerMod = powerMod;
    }

    @Override
    public String toString() {
        return "Xmen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", codename='" + codename + '\'' +
                ", poziom mocy=" + powerLevel +
                '}';
    }
}
