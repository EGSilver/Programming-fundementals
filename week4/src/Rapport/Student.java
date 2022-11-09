package Rapport;

public class Student {
    private String klasgroep;
    private String naam;

    public Student(String klasgroep, String naam) {
        this.klasgroep = klasgroep;
        this.naam = naam;
    }

    public String getKlasgroep() {
        return klasgroep;
    }

    public void setKlasgroep(String klasgroep) {
        this.klasgroep = klasgroep;
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
                "klasgroep='" + klasgroep + '\'' +
                ", naam='" + naam + '\'' +
                '}';
    }
}
