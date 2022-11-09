package LoopsTwo;

import javax.swing.*;

public class Oef4 {
    public static void main(String[] args) {
        int aantal  = Integer.parseInt(JOptionPane.showInputDialog("**Geef Aantal**"));
        int som = 0;
        int gemiddelde = 0;
        for (int i = 1; i <= aantal; i++) {
            int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
            som = som + getal;
            gemiddelde = som / aantal;
       }
        System.out.println(gemiddelde);
    }
}
