package LoopsTwo;

import javax.swing.*;

public class Oef3 {
    public static void main(String[] args) {
        double kwadraat = 0;
        int beginwaarde = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        int eindwaarde = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        for (int i = beginwaarde; i <= eindwaarde ; i++) {
            kwadraat = Math.pow(i,2);
            if (kwadraat % 2 == 0) {
                System.out.println(i + " " +kwadraat);
            }
        }
    }
}
