package Oefeningen;

import Lijsten.Vak;

public class Product {
    private String omschrijving;
    int aantalInVoorraad;
    double prijs;

    public Product(String omschrijving, int aantalInVoorraad, double prijs) {
        this.omschrijving = omschrijving;
        this.aantalInVoorraad = aantalInVoorraad;
        this.prijs = prijs;
    }

    // verhoogPrijs : verhoogt de prijs met een bepaald percentage (= parameter).
    //o Alle getters.
    //o De setter setPrijs moet nagaan of de verandering van prijs in een vork ligt van +10% en -
    //10%

    public void verhoogPrijs(double increasePrice) {
    double res = this.prijs * (1+increasePrice);
        System.out.println(res);
    }


    public String getOmschrijving() {
        return omschrijving;
    }


    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getAantalInVoorraad() {
        return aantalInVoorraad;
    }

    public void setAantalInVoorraad(int aantalInVoorraad) {
        this.aantalInVoorraad = aantalInVoorraad;
    }

    public double getPrijs() {
        return prijs;
    }

/*    public void setPrijs(double prijs) {
        double res = getPrijs();
        if (res >= res * 1.1) {
            System.out.println("Error too high");
        } else if (res <= res * 0.9)
        this.prijs = prijs;
        System.out.println("Error too low");
        System.out.println(res);
    }*/

    public void setPrijs(double prijs) {
        double min = this.prijs * 0.9;
        double max = this.prijs * 1.1;
        if (prijs >= min && prijs <= max) {
            this.prijs = prijs;
        } else {
            System.out.println("de prijs moet liggen tussen " +min+ " en " + max);
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "omschrijving='" + omschrijving + '\'' +
                ", aantalInVoorraad=" + aantalInVoorraad +
                ", prijs=" + prijs +
                '}';
    }
}
