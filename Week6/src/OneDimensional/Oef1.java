package OneDimensional;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Oef1 {
    public static void main(String[] args) {
        int a [] = new int[5];
        for (int i = 0; i < a.length ; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        }
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
