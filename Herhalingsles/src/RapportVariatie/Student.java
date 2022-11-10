package RapportVariatie;

public class Student {
    private String naam;

    public Student(String naam) {
        this.naam = naam;
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
                "naam='" + naam + '\'' +
                '}';
    }
}
