package LoopCounter;

import javax.swing.*;

public class Oef3 {
    public static void main(String[] args) {
        int beginwaarde = Integer.parseInt(JOptionPane.showInputDialog("Geef start getal in"));
        int eindwaarde = Integer.parseInt(JOptionPane.showInputDialog("Geef eind getal in"));
        double total = 0;
        for (int i = beginwaarde; i <= eindwaarde; i++) {
            if (i % 2 == 0) {
                total = Math.pow(i, 2);
                System.out.println(total);


            }
        }
    }
}
