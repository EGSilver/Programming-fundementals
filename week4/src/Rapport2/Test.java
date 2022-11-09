package Rapport2;

public class Test {
    public static void main(String[] args) {
        Vak o1 = new Vak(10, "Frans");
        Vak o2 = new Vak(11, "Java");
        Vak o3 = new Vak(10, "Databanken");
        Student studJan = new Student("1IMSA", "Jan");
        Rapport rapJan = new Rapport(studJan);
        rapJan.voegToe(o1);
        rapJan.voegToe(o2);
        rapJan.voegToe(o3);
        rapJan.berekenGemiddelde();
        System.out.println(rapJan);
    }
}