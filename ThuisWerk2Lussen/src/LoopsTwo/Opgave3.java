package LoopsTwo;

import javax.swing.*;

public class Opgave3 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Give number up to 100"));
        if (getal > 100) {
            System.out.println("Error number is higher then 100");
        } else {
            for (int i = 1; i <= getal; i++) {
                    while (i / i == 1 && i / 1 == 1) {
                        System.out.println("Priemgetal: " + getal);
                }
            }
        }
    }
}
