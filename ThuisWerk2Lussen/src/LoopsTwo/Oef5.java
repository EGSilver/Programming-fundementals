package LoopsTwo;

import javax.swing.*;

public class Oef5 {
    public static void main(String[] args) {
        int getal, voorlopigG = 0;
        int voorlopig = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        for (int i = 0; i < 3; i++) {
            getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
            if (getal < voorlopig) {
                voorlopig = getal;
            } else if (getal > voorlopig) {
                voorlopigG = getal;
            }
        }
        System.out.println("Kleinste Nummer:"+voorlopig);
        System.out.println("Grootste Nummer: "+voorlopigG);
    }
}
