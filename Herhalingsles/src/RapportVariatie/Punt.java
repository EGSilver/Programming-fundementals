package RapportVariatie;

public class Punt {
    private Vak vak;
    private int punt;

    public Punt(Vak vak, int punt) {
        this.vak = vak;
        this.punt = punt;
    }

    public Vak getVak() {
        return vak;
    }

    public void setVak(Vak vak) {
        this.vak = vak;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    @Override
    public String toString() {
        return "Punt{" +
                "vak=" + vak +
                ", punt=" + punt +
                '}';
    }
}
