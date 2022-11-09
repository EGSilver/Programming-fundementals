package LoopCounter;

import javax.swing.*;

public class Oef11 {
    public static void main(String[] args) {
        //Toon alle getallen tussen 100 en 200 die deelbaar zijn door 9.
        for (int getal = 100; getal <= 200; getal++) {
            if (getal % 9 == 0) {
                System.out.println(getal);
            }
        }

    }
}
