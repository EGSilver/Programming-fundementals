import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Voorbeeld2 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 3 ; i++) {
            int getal = Integer.parseInt(JOptionPane.showInputDialog("geef een getal op"));
            res = res + getal;

        }
        System.out.println(res);
    }
}
