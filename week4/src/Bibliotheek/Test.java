package Bibliotheek;

public class Test {
    public static void main(String[] args) {
        Membership m1 = new Membership(17412,"Paul Doog", true);
        Membership m2 = new Membership(21849,"Lise Steel",false);
        Item i1 = new Item(0,"Het Vedriet van Belgie",0);
        Item i2 = new Item(2,"70 Jaar Muziek",7.2);
        Item i3 = new Item(1,"Sound of disaster",0.6);
        Item i4 = new Item(3,"De Morgen",0.2);
        Item i5 = new Item(0,"De verwarp",0);
        Item i6 = new Item(0,"Dave");
        Register r1 = new Register(m1);
        Register r2 = new Register(m2);
        //System.out.println(m1);
        //m1.bepaalInwoner();
        //System.out.println(m1);
        //m1.Setlidnummer(13);
        //System.out.println(m1.getlidnummer());
        //i2.setType(-5);
        //i2.getTypeAsText();
        //System.out.println();
        //i1.print();
        //System.out.println(i6.print());
        System.out.println(r1.voegtoe(i1));
        System.out.println(r1.voegtoe(i2));
        System.out.println(r1.voegtoe(i3));
        System.out.println(r1.voegtoe(i4));
        System.out.println(r1.voegtoe(i5));
        System.out.println(r1.voegtoe(i2));
        System.out.println(r1.voegtoe(i1));
        System.out.println(r1);
        System.out.println(r1.aanvaard());
        //System.out.println(r2.aanvaard());
        r1.maakBon();

    }
}
