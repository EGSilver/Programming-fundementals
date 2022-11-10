package OneDimensionalArraylist;

import java.util.Arrays;

public class Opvang {
    private boolean rechtKorting;
    private String[] activiteiten = new String[4];
    private boolean[] aanwezigheden = new boolean[20];

    public Opvang(String[] activiteiten) {
        this.activiteiten = activiteiten;
        for (int i = 0; i < aanwezigheden.length; i++) {
            aanwezigheden[i] = true;
        }
    }

    public void berekentotaal () {

    }

    public boolean isRechtKorting() {
        return rechtKorting;
    }

    public void setRechtKorting(boolean rechtKorting) {
        this.rechtKorting = rechtKorting;
    }

    public String[] getActiviteiten() {
        return activiteiten;
    }

    public void setActiviteiten(String[] activiteiten) {
        this.activiteiten = activiteiten;
    }

    public boolean[] getAanwezigheden() {
        return aanwezigheden;
    }

    public void setAanwezigheden(boolean[] aanwezigheden) {
        this.aanwezigheden = aanwezigheden;
    }

    @Override
    public String toString() {
        return "Opvang{" +
                "rechtKorting=" + rechtKorting +
                ", activiteiten=" + Arrays.toString(activiteiten) +
                ", aanwezigheden=" + Arrays.toString(aanwezigheden) +
                '}';
    }
}
