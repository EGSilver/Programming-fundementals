import javax.swing.*;

public class KleinsteGrootse {
    public static void main(String[] args) {
        int kleinste = +Integer.parseInt(JOptionPane.showInputDialog("Geef getallen op"));
        double getal = 0;
        for (int i = 0; i < 9; i++) {
            getal = +Integer.parseInt(JOptionPane.showInputDialog("Geef getallen op"));
            if (getal < kleinste) {
                kleinste =+ kleinste;
                System.out.println(kleinste);
            }
        }
    }
}
//vergelijken of het ingelezen getal nog kleiner is dan het kleinste.