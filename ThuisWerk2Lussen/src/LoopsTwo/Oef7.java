package LoopsTwo;

import javax.swing.*;

public class Oef7 {
    public static void main(String[] args) {
        int som = 0;
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        for (int i = 1; i <= 10 ; i++) {
            som = getal * i;
            System.out.println(i + " * " + getal + " = " + som);
        }
    }
}
