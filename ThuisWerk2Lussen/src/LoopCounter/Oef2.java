package LoopCounter;

import javax.swing.*;

public class Oef2 {
    public static void main(String[] args) {
        int getal;
        int som = 0;
        for (int i = 0; i <= 5 ; i++) {
            getal = Integer.parseInt(JOptionPane.showInputDialog("Geef getal op"));
            som = som + getal;
        }
        System.out.println(som);
    }

}
