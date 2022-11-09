package LoopCounter;

import javax.swing.*;

public class Oef6 {
    public static void main(String[] args) {
        double ingeef = 0;
        double voorlopig = Integer.parseInt(JOptionPane.showInputDialog("Geef ingeef"));
        double voorlopigK = voorlopig;
        double voorlopigG = voorlopig;
        for (int i = 0; i < 3 ; i++) {
            ingeef = Integer.parseInt(JOptionPane.showInputDialog("Geef ingeef"));
            if (ingeef < voorlopigK) {
                voorlopigK = ingeef;

            } else if (ingeef > voorlopigG) {
                voorlopigG = ingeef;
            }

        } System.out.println("Kleinste " + voorlopigK);
        System.out.println("Grootste: " + voorlopigG);
    }

    public static class Oef7 {
        public static void main(String[] args) {
            int start = 1;
            int som = 0;
            int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
            for (int i = 0; i < 9; i++) {
               som = getal * start;
               start++;
                System.out.println(getal + " * " + start+ " = " +som);
            }
        }
    }

    public static class Oef8 {
        public static void main(String[] args) {
            int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
            int fac = getal;
            System.out.print(fac);
            for (int i = fac-1; i > 0; i--) {
                fac = fac * i;
                System.out.print("*"+i);
            }
            System.out.println("="+fac);
        }
    }
}
