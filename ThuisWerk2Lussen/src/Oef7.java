import javax.swing.*;

public class Oef7 {
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
