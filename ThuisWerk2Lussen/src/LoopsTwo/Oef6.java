package LoopsTwo;

import javax.swing.*;

public class Oef6 {
    public static void main(String[] args) {
        int fac = 0;
        int som = 0;
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        for (int i = getal-1; i > 0; i--) {
            getal = getal * i;
        } System.out.println(getal);
    }
}
