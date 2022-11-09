package Arraylists.Rapport;

public class Student {
    private String klas;
    private String naam;

    public Student(String klas, String naam) {
        this.klas = klas;
        this.naam = naam;
    }

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
    @Override
    public String toString() {
        return "Student{" +
                "klas='" + klas + '\'' +
                ", naam='" + naam + '\'' +
                '}';
    }
}

