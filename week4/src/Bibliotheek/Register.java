package Bibliotheek;
import java.util.ArrayList;

public class Register {
    private boolean aanvaard;
    private Membership member;
    private ArrayList<Item> items = new ArrayList<>();

    public Register(Membership member) {
        this.aanvaard = false;
        this.member = member;
    }

    public boolean voegtoe(Item i) {
        boolean check = false;
        int counter = 0;
        for (Item e : items) {
            counter += 1;
        }
        if (counter < 5) {
            this.items.add(i);
            check = true;
        } else if (counter >= 5) {
            check = false;
        }
        return check;
    }

    public boolean aanvaard(){
        int counter = 0;
        for (Item e : items) {
            counter += 1;
        } if (counter > 0) {
            this.aanvaard = true;
        } else if (counter <= 0) {
            this.aanvaard = false;
        } return  this.aanvaard;
    }

    public void maakBon() {
        int counterBook = 0;
        int counterAlbum = 0;
        int counterPartituur = 0;
        int counterKrantTijschrift = 0;
        double som = 0;
        String s = "";
        if (this.aanvaard == false) {
            System.out.println("Het register is niet aanvaard");
        } else {
            System.out.println(member + " heeft wat volgt: \n");
            for (Item e : items) {
                s += (e.getTypeAsText() + " (" + e.getTitel() + ", bijdrage = " + e.getBijdrage() + ")\n" );
                som += (e.getBijdrage());
                if (e.getType() == 0) {
                    counterBook++;
                } else if (e.getType() == 1) {
                    counterPartituur++;
                } else if (e.getType() == 2) {
                    counterAlbum++;
                } else {
                    counterKrantTijschrift++;
                }
            }
        }
        System.out.println(s + "Totaal: " + counterBook + " boek(en) " + counterAlbum + " album(s) " + counterPartituur + " partituur " + counterKrantTijschrift + " krant(en)/tijdschrift(en)" + " voor een totale bijdrage van €" + som );
    }



    @Override
    public String toString() {
        return "Register{" +
                "aanvaard=" + aanvaard +
                ", member=" + member +
                ", items=" + items +
                '}';
    }
}
