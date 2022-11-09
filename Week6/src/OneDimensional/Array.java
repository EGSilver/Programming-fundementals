package OneDimensional;

import javax.swing.*;
import java.util.Arrays;

public class Array {
    //Initialiseren van OneDimensionalArraylist.
    private double[] a = {12, 78, 45, 48, 74};

    public Array() {

    }

    public void drukAf() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void berekenSom() {
        int som = 0; //a[0] + a[1] + a[2] + a[3] + a[4];
        for (int i = 0; i < a.length; i++) {
            som += a[i];
        }
        System.out.println(som);
    }

    public double berekenGemiddelde() {
        double gemiddelde = 0;
        double som = 0;
        //double andereSom = 0;
        for (int i = 0; i < a.length; i++) {
            som += a[i];
            gemiddelde = som / a.length;
        }
        return gemiddelde;

    }

    public void drukGetallenGroterTien() {
        double voorlopig = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10) {
                System.out.print(a[i] + " ");

            }
        }
    }

    //voeg een method vermenigvuldig() toe die alle getallen verschillend van 0 met elkaar
    //vermenigvuldigt. Om dit uit te testen, moet je zeker één keer als input 0 opgeven.

    public void vermenigvuldig() {
        double totaal = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                totaal = totaal * a[i];
                System.out.println(totaal);
            }
        }
    }

    public void vervangGetalInArray() {
        double gem = this.berekenGemiddelde();
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - gem;
        }
    }

    public void tellen () {
        int counter = 0;
        double getal = Integer.parseInt(JOptionPane.showInputDialog("Geef getal"));
        for (int i = 0; i < a.length; i++) {
            //if (a.equals(getal))
            if (getal == a[i]) {
                counter++;
            }
        } System.out.println(counter);
    }


    //  private double[] a = {12, 78, 45, 48, 74};
    public double bepaalGrootste() {
        int counter = 0;
        double voorlopig = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > voorlopig) {
                voorlopig = a[i];
            }
            if (voorlopig == a[i]) {
                counter++;
            }
            a[4] = voorlopig;
        } return voorlopig;
    }

    public int indexPlaatsGrootste() {
        int counter = 0;
        double voorlopig = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > voorlopig) {
                voorlopig = a[i];
            }
            if (voorlopig == a[i]) {
                counter++;
            } a[4] = voorlopig;
        } return counter;
    }

    public int indexGrootste() {
        double grootste = a[0];
        int plaats = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >
                    grootste) {
                grootste = a[i];
                plaats = i;
            }

        } return plaats;
    }

    public int indexKleinste() {
        double kleinste = a[0];
        int plaats = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < kleinste) {
                kleinste = a[i];
                plaats = i;
            }

        } return plaats;
    }


    @Override
    public String toString() {
        return "Array{" +
                "a=" + Arrays.toString(a) +
                '}';
    }
}

