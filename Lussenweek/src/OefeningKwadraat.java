import javax.swing.*;

public class OefeningKwadraat {
    public static void main(String[] args) {
//        double product = 1;
//        for (int i = 0; i <5 ; i++) {
//           double getal = Double.parseDouble(JOptionPane.showInputDialog("Geef getal op"));
//           product = product * getal;
//
//        }
//        System.out.println(product);
       /* for (int i = 0; i <= 8 ; i++) {
            double e = Math.pow(i, 2);
            System.out.println(e);

        }*/
        int res = Integer.parseInt(JOptionPane.showInputDialog("Beginwaarde"));
        int res2 = Integer.parseInt(JOptionPane.showInputDialog("Eindwaarde"));
        for (int i = res; i < res2 ; i++) {
            //vertaling: als de rest bij deling door 2 gelijk is aan 0 ==>
            if (i % 2 == 0) {
                double e = (i*i);
                System.out.println(e);
            }


        }
    }
}


//Lees een begin en eindwaarde in en bereken alle kwadraten tussen beginwaarde en eindwaarde, maar
//enkel van de even getallen.