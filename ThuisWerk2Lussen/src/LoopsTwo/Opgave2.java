package LoopsTwo;

import javax.swing.*;

public class Opgave2 {
    public static void main(String[] args) {
        double gemiddelde = 0;
        double liters = 0;
        double km = 0;
        int getankt = 0;
        double verbruikPKM = 0;
        for (int i = 0; i < 5; i++) {
             liters = Integer.parseInt(JOptionPane.showInputDialog("Geef aantal liters"));
             km = Integer.parseInt(JOptionPane.showInputDialog("Geef aantal km"));
            if (liters == 0) {
               gemiddelde = verbruikPKM / getankt;
               i = 5;
                System.out.println(getankt);
            } else {
                getankt++;
                verbruikPKM += liters / km * 100;
            }
        } //System.out.println(verbruikPKM);
        System.out.println(gemiddelde);
    }
}
