package LoopsTwo;

import javax.swing.*;

public class Opgave3 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Give number up to 100"));
        boolean isPrime = false;
        if (getal > 100) {
            System.out.println("Error number is higher then 100");
        } else {
            for (int i = 1; i <= getal; i++) {
                if (getal % i == 0) {
                    System.out.println(getal + " " + " deler: " + i);
                }
                for (int j = 2; j <= getal/2 ; j++) {
                    System.out.println(j);
                    if (getal % j == 0) {
                        isPrime = true;
                    }
                }
            }
            if (isPrime) {
                System.out.println(getal + " is GEEN priemgetal");
            } else {
                System.out.println(getal + " is een priemgetal");
            }
        }
    }
}
