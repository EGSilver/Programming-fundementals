package clownOpdracht;

public class Test {
    public static void main(String[] args) {
        Clown c1 = new Clown("Loketti", 250);
        c1.vrijDag(1);
        c1.vrijDag(2);
        System.out.println(c1);

        //for loop om volgende test-gegevens te werken.
        // dagen 5 tem 30 : 80db
        // dagen 120 tem 200 : 83db
        // 300 tot 340 : 70db
        for (int i = 4; i < 30 ; i++) {
            c1.gelachen(80,i);
        }
        for (int i = 120-1; i < 200 ; i++) {
            c1.gelachen(83,i);
        }             //299
        for (int i = 300-1; i < 340 ; i++) {
            c1.gelachen(70,i);
        }
        System.out.println(c1);
        c1.berekenLachIndex();
        //c1.overzichtDB();
        //c1.overzichtLoon();
        System.out.println(c1.overzichtWerkdagen());
        System.out.println(c1.berekenBonus());
    }
}
