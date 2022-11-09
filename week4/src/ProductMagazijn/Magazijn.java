package ProductMagazijn;

import java.util.ArrayList;

public class Magazijn {
    private String postcode;
    private ArrayList<Product> lijst = new ArrayList<>();

    public Magazijn(String postcode) {
        this.postcode = postcode;
    }

    public void voegToe(Product p) {
        this.lijst.add(p);
    }


    public void verhoogPrijzenBP() {
        for (Product p : lijst) {
            p.verhoogprijs(0.1);
        }
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Magazijn{" +
                "postcode='" + postcode + '\'' +
                ", lijst=" + lijst +
                '}';
    }
}
