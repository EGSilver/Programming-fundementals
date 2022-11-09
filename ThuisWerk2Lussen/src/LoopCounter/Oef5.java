package LoopCounter;

import javax.swing.*;

public class Oef5 {
    public static void main(String[] args) {
        int getal;
        int totaal = 0;
        int gemiddelde = 0;
        for (int i = 0; i < 5; i++) {
            getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
            totaal += getal;
            gemiddelde = totaal / 5;
        } System.out.println("gemiddelde: " + gemiddelde);
    }
}
