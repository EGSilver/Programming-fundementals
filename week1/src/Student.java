public class Student {

    //eigenschappen
    private String name;

    //String is een datatype = alle characters
    private String voornaam;
    private int aantalStudiepunten;

    //constructor = functie waarmee je een object maakt
    //tussen ronde haakjes() = parameterlijst

    public Student(String pname, String pvoornaam, int paantalStudiepunten) {
        //defineing (toekenning) gebeurt van rechts naar links.
        this.name = pname;
        this.voornaam = pvoornaam;
        this.aantalStudiepunten = paantalStudiepunten;
    }

    public void print() {   //Dean Vervaeck neemt 60 studiepunten op
        System.out.println(voornaam + " " + name + " neemt " + aantalStudiepunten + " neemt studiepunten op");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", aantalStudiepunten=" + aantalStudiepunten +
                '}';
    }
}

