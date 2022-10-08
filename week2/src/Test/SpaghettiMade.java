package Test;

public class SpaghettiMade {
    private String beschrijving;
    private double basisPrijs, supplementVoorKaas, supplementAangepasteWijnen;

    public SpaghettiMade(String beschrijving, double basisPrijs, double supplementVoorKaas, double supplementAangepasteWijnen) {
        this.beschrijving = beschrijving;
        this.basisPrijs = basisPrijs;
        this.supplementVoorKaas = supplementVoorKaas;
        this.supplementAangepasteWijnen = supplementAangepasteWijnen;
    }

    public SpaghettiMade(String beschrijving, double basisPrijs) {
        this.beschrijving = beschrijving;
        this.basisPrijs = basisPrijs;
        this.supplementVoorKaas = this.basisPrijs*0.1;
        this.supplementAangepasteWijnen = 15;
    }

    public double totaalPrijs(int aantal){
        return this.basisPrijs*aantal;
    }

    public void beschrijf(){
        System.out.println(String.format("Spaghetti %s aan €%.1f, supplement kaas voor €%.1f en aangepaste wijnen voor €%.1f",
                this.beschrijving,this.basisPrijs,this.supplementVoorKaas,this.supplementAangepasteWijnen));
    }

    public void totaalAlles(int aantal, boolean kaas, boolean wijn){
        double totaalPrijs = this.basisPrijs * aantal;
        if (kaas){
            double totaalKaas = this.supplementVoorKaas*aantal;
            if (wijn){
                double totaalWijn = this.supplementAangepasteWijnen*aantal;
                System.out.println(String.format("je betaalt voor spaghetti %s voor %d personen %.1f€",this.beschrijving,aantal,totaalPrijs));
                totaalPrijs = totaalPrijs + totaalKaas + totaalWijn;
                System.out.println(String.format("supplement kaas = %.1f \nsupplement wijn = %.1f \n--algemeen totaal = %.1f\n",totaalKaas,totaalWijn,totaalPrijs));
            }
            else {
                System.out.println(String.format("je betaalt voor spaghetti %s voor %d personen %.1f€",this.beschrijving,aantal,totaalPrijs));
                totaalPrijs = totaalPrijs + totaalKaas;
                System.out.println(String.format("supplement kaas = %.1f \n--algemeen totaal = %.1f\n",totaalKaas,totaalPrijs));
            }
        }
        else {
            if (wijn){
                double totaalWijn = this.supplementAangepasteWijnen*aantal;
                System.out.println(String.format("je betaalt voor spaghetti %s voor %d personen %.1f€",this.beschrijving,aantal,totaalPrijs));
                totaalPrijs = totaalPrijs + totaalWijn;
                System.out.println(String.format("supplement wijn = %.1f \n--algemeen totaal = %.1f\n",totaalWijn,totaalPrijs));
            }
            else {
                System.out.println(String.format("je betaalt voor spaghetti %s voor %d personen %.1f€",this.beschrijving,aantal,totaalPrijs));
                System.out.println(String.format("--algemeen totaal = %.1f\n",totaalPrijs));
            }
        }

    }

    public void indexeer(){
        this.basisPrijs *= 1.02;
        this.supplementVoorKaas *= 1.02;
        this.supplementAangepasteWijnen *= 1.02;
    }

    @Override
    public String toString() {
        return "Spaghetti{" +
                "beschrijving='" + beschrijving + '\'' +
                ", basisPrijs=" + basisPrijs +
                ", supplementVoorKaas=" + supplementVoorKaas +
                ", supplementAangepasteWijnen=" + supplementAangepasteWijnen +
                '}';
    }

}