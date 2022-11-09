package OneDimensional;

public class TestArray {
    public static void main(String[] args) {
        Array a1 = new Array();
        a1.drukAf();
        System.out.println();
        System.out.println("\n________berekenSom");
        a1.berekenSom();
        System.out.println();
        System.out.println("________berekenGemiddelde");
        a1.berekenGemiddelde();
        System.out.println();
        System.out.println("________drukGetallenGroterTien");
        a1.drukGetallenGroterTien();
        System.out.println();
        System.out.println("\n________vermenigvuldig");
        a1.vermenigvuldig();
        System.out.println();
        System.out.println("________vervangGetal");
        //a1.vervangGetalInArray();
        System.out.println(a1);
        System.out.println();
        System.out.println("________tellen");
        //a1.tellen();
        System.out.println();
        System.out.println("________bepaalGrootste");
        //a1.bepaalGrootste();
        //System.out.println(a1.bepaalGrootste());
        System.out.println();
        System.out.println("________indexGrootste");
        System.out.println(a1);
        a1.indexGrootste();
        System.out.println(a1.indexGrootste());
    }
}
