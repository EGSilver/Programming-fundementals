package LoopsTwo;

import javax.swing.*;

public class Opgave2While {
    public static void main(String[] args) {
        double gemiddelde = 0;
        double liters = 1;
        double km = 0;
        int getankt = 0;
        double verbruikPKM = 0;
        do {
            liters = Integer.parseInt(JOptionPane.showInputDialog("Geef aantal liters"));
            if (liters != 0) {
                km = Integer.parseInt(JOptionPane.showInputDialog("Geef aantal km"));
                getankt++;
                verbruikPKM += liters / km * 100;
            }
        }
        while (liters != 0);
        gemiddelde = verbruikPKM / getankt;

        System.out.println(gemiddelde);
    }
}


