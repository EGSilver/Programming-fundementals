package LoopsTwo;

import javax.swing.*;

public class Oefening1 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i < 6 ; i++) {
            int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
            product = getal * product;
            System.out.println(product);
        }
    }
}
