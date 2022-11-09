package Bibliotheek;

public class Item {
    private int type;
    private final int BOEK = 0;
    private final int PARTITUUR = 1;
    private final int ALBUM = 2;
    private final int KRANT_TIJDSCHRIFT = 3;
    private String titel;
    private double bijdrage;

    public Item(int type, String titel) {
        this.type = type;
        this.titel = titel;
        this.bijdrage = 0;
    }


    public Item(int type, String titel, double bijdrage) {
        this.type = type;
        this.titel = titel;
        this.bijdrage = bijdrage;
    }

    public String getTypeAsText() {
        String b = "";
        if (type == 0) {
            b = "BOEK";
        } else if (type == 1) {
            b = "PARTITUUR";
        } else if (type == 2) {
            b = "ALBUM";
        } else if (type == 3) {
            b = "KRANT/TIJDSCHRIFT";
        }
        return b;
    }

    public String print () {
        //System.out.println(getTypeAsText() + " " + this.titel + " " + this.bijdrage);
        String s = getTypeAsText() + " (" + this.titel + ", bijdrage = " + this.bijdrage + ")";
        return s;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type > 3 || type < 0 ) {
            this.type = 0;
        } else {
            this.type = type;
        }
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getBijdrage() {
        return bijdrage;
    }

    public void setBijdrage(double bijdrage) {
        this.bijdrage = bijdrage;
    }

    public int getBOEK() {
        return BOEK;
    }

    public int getPARTITUUR() {
        return PARTITUUR;
    }

    public int getALBUM() {
        return ALBUM;
    }

    public int getKRANT_TIJDSCHRIFT() {
        return KRANT_TIJDSCHRIFT;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", BOEK=" + BOEK +
                ", PARTITUUR=" + PARTITUUR +
                ", ALBUM=" + ALBUM +
                ", KRANT_TIJDSCHRIFT=" + KRANT_TIJDSCHRIFT +
                ", titel='" + titel + '\'' +
                ", bijdrage=" + bijdrage +
                '}';
    }
}
