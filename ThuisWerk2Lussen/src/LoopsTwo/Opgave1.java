package LoopsTwo;

import javax.swing.*;

public class Opgave1 {
    public static void main(String[] args) {
        int geschatteratten = 2000000;
        int counter = 0;
        int aantalrat = Integer.parseInt(JOptionPane.showInputDialog("Geef aantal ratten"));
        for (int i = geschatteratten; i < aantalrat; i++) {
            if (geschatteratten < aantalrat) {
                counter++;
                geschatteratten *= 1.15;
                i = geschatteratten;
            }
        }
        System.out.println("In " + counter+ " jaar zijn er in New York " +aantalrat + " ratten.");
    }
}
