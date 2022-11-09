package Rapport;

public class Test {
    public static void main(String[] args) {
        Vak o1 = new Vak(11, "Frans");
        Vak o2 = new Vak(10, "Java");
        Vak o3 = new Vak(4, "Databanken");
        Student studJan = new Student("1IMSA", "Jan");
        Rapport rapJan = new Rapport(studJan);
        rapJan.voegtoe(o1);
        rapJan.voegtoe(o2);
        rapJan.voegtoe(o3);
        System.out.println(rapJan);
        rapJan.berekenGemiddelde();
        rapJan.toonAfwijking();
    }
}
