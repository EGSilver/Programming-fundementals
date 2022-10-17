package Oefeningen;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Magazijn {
    private String postcode;
    private ArrayList<Product> productList = new ArrayList<>();

    public Magazijn(String postcode) {
        this.postcode = postcode;
    }

    //Uitbreiding 1 : bestellingen bij de leverancier. Indien de voorraad minder dan 0 is, wordt er een bestelling
    //geplaatst  bij de leverancier.

    //Uitbreiding 2 :
    //Maak een functie die alle producten verwijdert die minder dan 3,5 euro kosten. Return het aantal
    //verwijderde producten.
    //Hoe doe je dit? Zoek dit eens zelf op met keywords “Java remove arraylist”
    //Maak een functie die nagaat of een bepaald product in het magazijn aanwezig is, op basis van de
    //omschrijving. Deze functie returnt true of false.

    public double bestellingLeverancier() {
        System.out.println("De volgende producten zijn besteld bij de leverancier: ");
        double aantalBesteld = 0;
        for (Product p : productList) {
            if (p.getAantalInVoorraad() <= 0) {
                aantalBesteld =+ 1;
                System.out.println(p.getOmschrijving());
            }
        }
        System.out.println("Totaal aantal producten besteld: ");
        return aantalBesteld;
    }

    public void verhoogPrijzen50() {
        for (Product p : productList) {
             p.verhoogPrijs(0.5);
        }

    }

    public String overzichtString() {
        String s = "***Voor de prijsverhoging*** " + "\n" + "Volgende Producten zijn in voorraad in magazijn " + postcode + "\n";
        for (Product p : productList) {
            s = s + p.getOmschrijving() + " " + p.getAantalInVoorraad() + " kosten " + p.getPrijs() + "€" + "\n";
        } return s;
    }

    public void ToonLageVoorraad() {
        for (Product l : productList) {
            if (l.getAantalInVoorraad() < 5) {
                System.out.println("Product in lage voorraad " + l.getOmschrijving() + "\naantal voorradig: " + l.getAantalInVoorraad());
            }
        }
    }

    public void voegProductToe(Product p) {
        this.productList.add(p);
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Magazijn{" +
                "postcode='" + postcode + '\'' +
                ", productList=" + productList +
                '}';
    }
}
