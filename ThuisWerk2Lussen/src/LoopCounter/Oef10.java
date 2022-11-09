/*
package LoopCounter;

import javax.swing.*;

//public class Oef10 {
//    public static void main(String[] args) {
//        //Lees een getal in. Het programma maakt de som van het ingegeven getal met al zijn
//        //voorgaande gehele getallen.
//        //Voorbeeld : 5 wordt ingelezen.
//        //Som wordt berekend van 1, 2, 3 en 4.
//        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
//        for (int i = 0; i < 5; i++) {
//            int outcome = getal - i;
//            outcome += outcome;
//            System.out.println(outcome);
//            //System.out.println(i);
//
//        }
//    }
//}

import javax.swing.*;

public class Oef10 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        int getal2 = 0;
        System.out.print("gekozen getal = "+getal+" uitkomsten : ");
        for (int i = getal-1; i >0 ; i--) {
            getal2 = getal2+i;
            System.out.print(i+", ");

        }
        System.out.println(" uitkomst samen = "+getal2);
    }
}

*/
package LoopCounter;

import javax.swing.*;

public class Oef10 {
    public static void main(String[] args) {
       int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
       int som = 0;
        for (int i = 0; i < getal; i++) {
            som += i;
            System.out.println(som);
        }
    }
}
