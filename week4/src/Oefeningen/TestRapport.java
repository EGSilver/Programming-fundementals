package Oefeningen;

public class TestRapport {
    public static void main(String[] args) {
        Opleidingsonderdeel o1 = new Opleidingsonderdeel(4, "Frans");
        Opleidingsonderdeel o2 = new Opleidingsonderdeel(3, "Java");
        Opleidingsonderdeel o3 = new Opleidingsonderdeel(2, "Databanken");
        Student studJan = new Student("1IMSA", "Jan");
        Rapport rapJan = new Rapport(studJan);
        rapJan.voegtoe(o1);
        rapJan.voegtoe(o2);
        rapJan.voegtoe(o3);
        //System.out.println(rapJan);
        //System.out.println(rapJan.berekenGemiddelde());
        rapJan.afwijking();
        rapJan.puntenOpvragen();
        //System.out.println(o1.returnPunten());
        System.out.println(o2.returnPunten());
        System.out.println(o3.returnPunten());
        System.out.println();
        System.out.println();
        System.out.println(rapJan.overzicht());
    }
}
