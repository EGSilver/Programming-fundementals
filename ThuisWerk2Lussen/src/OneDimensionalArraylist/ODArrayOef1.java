package OneDimensionalArraylist;

import javax.swing.JOptionPane;
public class ODArrayOef1 {
    private int[] lijstGetallen = new int[5];

    public ODArrayOef1() {
        for (int i = 4; i >= 0; i--) {
            int invoer = 0;
            this.lijstGetallen[i] = invoer = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        }
    }



    public void drukAf() {
        for (int i = 0; i < 5; i++) {
            System.out.println(lijstGetallen[i]);
        }
    }
}
