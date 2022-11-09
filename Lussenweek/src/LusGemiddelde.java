import javax.swing.*;

public class LusGemiddelde {
    public static void main(String[] args) {
        double som = 0;
        for (int i = 0; i < 5 ; i++) {
           som += Double.parseDouble(JOptionPane.showInputDialog("geef een getal"));
        }
        System.out.println("Gemiddelde= " +(som/5));
    }
}
