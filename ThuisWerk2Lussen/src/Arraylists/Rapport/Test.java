package Arraylists.Rapport;

public class Test {
    public static void main(String[] args) {
        Vakken o1 = new Vakken(10, "Frans");
        Vakken o2 = new Vakken(11, "Java");
        Vakken o3 = new Vakken(10, "Databanken");
        Student studJan = new Student("1IMSA", "Jan");
        Rapport rapJan = new Rapport(studJan);
        rapJan.voegToe(o1);
        rapJan.voegToe(o2);
        rapJan.voegToe(o3);
        System.out.println();
        System.out.println(rapJan);
        System.out.println();
        System.out.println("punten");
        rapJan.printPunten();
        System.out.println("gemiddelde");
        rapJan.gemiddelde();
        System.out.println();
        System.out.println("afwijking");
        rapJan.afwijking();
    }
}

