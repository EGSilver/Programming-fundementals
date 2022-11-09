package LoopsTwo;
import javax.swing.*;

public class Oef10 {
    public static void main(String[] args) {
        int ul = 1;
        int a = 0;
        int d = 0;
        int som = 0;
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        //System.out.println(ul);
        for (int i = 0; i < 10; i++) {
            som = (int) Math.pow(getal, i);
            //ul = ul * getal;
            //System.out.println(ul);
            System.out.println(som);
        }
    }
}
