package Oefeningen2;

import java.util.ArrayList;

public class Magazijn {
    private String postcode;
    private ArrayList<Product> lijst = new ArrayList<>();

    public Magazijn(String postcode) {
        this.postcode = postcode;
    }

    public void checkVoorrraad() {
        System.out.println("Producten met lage voorraad:" );
        for (Product p : lijst) {
            if (p.getAantalInVoorraad() <= 0) {
                System.out.println(p.getOmschrijving());
            }
        }
    }

    public void voegProductToe(Product e) {
        this.lijst.add(e);
    }

    public void verhoogPrijs50() {
        for (Product p : lijst) {
            p.verhoogPrijs(50);
        }

    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public ArrayList<Product> getLijst() {
        return lijst;
    }

    public void setLijst(ArrayList<Product> lijst) {
        this.lijst = lijst;
    }

    @Override
    public String toString() {
        return "Magazijn{" +
                "postcode='" + postcode + '\'' +
                ", lijst=" + lijst +
                '}';
    }
}


