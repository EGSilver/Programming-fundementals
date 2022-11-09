package OneDimensionalArraylist;

import javax.swing.*;

public class Oefening1 {
    private int[] arrayList = {1, 5, 10, 20, 50};

    public Oefening1() {
    }

    public void print() {
        int res = 0;
        for (int i = 0; i < arrayList.length; i++) {
            res = arrayList[i];
            System.out.println(arrayList[i]);
        }
    }

    public void drukAfOmgekeerd() {
        int res = 0;
        for (int i = arrayList.length - 1; i >= 0; i--) {
            res = arrayList[i];
            System.out.println(arrayList[i]);
        }
    }

    public void berekenSom() {
        int res = 0;
        for (int i = 0; i < arrayList.length; i++) {
            res += arrayList[i];
        }
        System.out.println(res);
    }

    public void berekenGemiddelde() {
        double res = 0;
        for (int i = 0; i < arrayList.length; i++) {
            res += arrayList[i];
        }
        res /= arrayList.length;
        System.out.println(res);
    }

    public void drukGetallenGroterTien() {
        int res = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > 10) {
                System.out.println(arrayList[i]);
            }
        }
    }

    public void vermendigvuldig() {
        double res = 1;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] != 0) {
                res *= arrayList[i];
            }
        }
        System.out.println(res);
    }

    public void vervangVerschil() {
        int ser = 0;
        double res = 0;
        for (int i = 0; i < arrayList.length; i++) {
            res += arrayList[i];
        }
        res /= arrayList.length;
        System.out.println("Gemiddelde: " + res);
        for (int i = 0; i < arrayList.length; i++) {
            ser = (int) (arrayList[i] - res);
            arrayList[i] = ser;
            System.out.println(arrayList[i]);
        }
    }

    public void vergelijkMetIngelezen() {
        int counter = 0;
        int res = Integer.parseInt(JOptionPane.showInputDialog("Geef Getal"));
        for (int i = 0; i < arrayList.length; i++) {
            if (res == arrayList[i]) {
                counter++;
            }
        }
        System.out.println("Aantal dezelfde getallen in de lijst: " + counter);
    }

    public int grootsteGetal() {
        int counter = 0;
        int res = arrayList[0];
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > res) {
                res = arrayList[i];
                counter++;
            }
        }
        arrayList[4] = res;
        System.out.println(res);
        return arrayList[4];
    }

    //****************
    public void grootsteGetalPlaats() {
        int counterGr = 0, counterKl = 0;
        int kleinste = arrayList[0];
        ;
        int ser = 0, seri = 0;
        int grootste = arrayList[0];
        //{2, 3, 1, 5, 4};
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > grootste) {
                grootste = arrayList[i];
                ser = i;
                counterGr++;
                //System.out.println("Gr"+ser);
            } else if (arrayList[i] < kleinste) {
                kleinste = arrayList[i];
                seri = i;
                counterKl++;
                //System.out.println("kl" +seri);
            }
        }
        //arrayList[seri] = arrayList[ser];
        //arrayList[ser] = arrayList[seri];
        System.out.println("Grootste getal: " + grootste);
        System.out.println("Kleinste getal: " + kleinste);
    }

    //*****************
    public void vergelijkArrays() {
        int counter = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] == arrayList.clone()[i]) {
                counter++;
            }
            System.out.println("Meest voorkomende getallen in lijst: " + counter);
        }
    }

    public void muntenEnBriefjes() {
        int res = 0;
        int bedrag = Integer.parseInt(JOptionPane.showInputDialog("Geef Bedrag"));
        System.out.println("Voor het " + bedrag + " heb je de volgende munstukken of briefjes nodig:");
        for (int i = 4; i >= 0; i--) {
            if (res <= bedrag) {
                res = bedrag / arrayList[i];
                System.out.println(res);
            }
        }
    }
}



