package LoopCounter;

import javax.swing.*;

public class Oef4 {
    public static void main(String[] args) {
        int res = Integer.parseInt(JOptionPane.showInputDialog("Beginwaarde"));
        int res2 = Integer.parseInt(JOptionPane.showInputDialog("Eindwaarde"));
        for (int i = res; i < res2 ; i++) {
            //vertaling: als de rest bij deling door 2 gelijk is aan 0 ==>
            if (i % 2 == 0) {
                double e = (i*i);
                System.out.println(e);
            }
        }
    }
}
