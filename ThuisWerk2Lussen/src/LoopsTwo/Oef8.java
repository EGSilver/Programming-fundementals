package LoopsTwo;

import javax.swing.*;

public class Oef8 {
    public static void main(String[] args) {
        int fibo = 0;
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        int aantal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        for (int i = 0; i <= aantal; i++) {
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.print(fibo + " ");
        }
    }
}
