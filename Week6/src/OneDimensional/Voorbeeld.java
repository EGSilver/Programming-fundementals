package OneDimensional;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Voorbeeld {
    public static void main(String[] args) {
       int a [] = new int[5];

        for (int i = 0; i < 5 ; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal"));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
