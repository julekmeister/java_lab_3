public class Omega extends Xmen{
    protected int powerM;
    private boolean isCosmicEntity;

    public Omega(){
        super();
        this.powerM=0;
        this.isCosmicEntity=false;
    }

    public Omega(int powerM, boolean isCosmicEntity) {
        this.powerM = powerM;
        this.isCosmicEntity = isCosmicEntity;
    }

    public Omega(int powerMod, int powerM, boolean isCosmicEntity) {
        super(powerMod);
        this.powerM = powerM;
        this.isCosmicEntity = isCosmicEntity;
    }

    public Omega(String imie, String nazwisko, String codename, int powerLevel, int powerMod, int powerM, boolean isCosmicEntity) {
        super(imie, nazwisko, codename, powerLevel, powerMod);
        this.powerM = powerM;
        this.isCosmicEntity = isCosmicEntity;
    }

    public int getPowerM() {
        return powerM;
    }

    public void setPowerM(int powerM) {
        this.powerM = powerM;
    }

    public boolean isCosmicEntity() {
        return isCosmicEntity;
    }

    public void setCosmicEntity(boolean cosmicEntity) {
        isCosmicEntity = cosmicEntity;
    }

    @Override
    protected int calcPower() {
        return super.calcPower()+powerM;
    }

    @Override
    public String toString() {
        return "Omega: {" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", codename='" + codename + '\'' +
                ", poziom mocy=" + powerLevel +
                ", modyfikator mocy= +" + (powerMod+powerM) +
                ", czyBytKosmiczny=" + isCosmicEntity +
                '}';
    }
}
