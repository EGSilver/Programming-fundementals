package OneDimensionalArraylist;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Oefening1 {
    private int[] arrayList = {1, 5, 10, 50, 50};

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
        int kleinste = arrayList[0];
        int ser = 0, seri = 0;
        int grootste = arrayList[0];
        int j = 0;
        int c = 0;
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] > grootste) {
                grootste = arrayList[i];
                c = i;
                System.out.println("c" +c);
            } else if (arrayList[i] < kleinste) {
                kleinste = arrayList[i];
                j = i;
                System.out.println("j" +j);
            }
        }
        int a = arrayList[c];
        arrayList[c] = arrayList[j];
        arrayList[j] = a;
        System.out.println("Grootste getal: " + grootste);
        System.out.println("Kleinste getal: " + kleinste);
    }
    //   2    4
    // 1 5 10 20 50

//    *****************
//    public void vergelijkArrays() {
//        int counter = 0;
//        for (int i = 0; i < arrayList.length; i++) {
//            if (arrayList[i] == arrayList.clone()[i]) {
//                counter++;
//            }
//            System.out.println("Meest voorkomende getallen in lijst: " + counter);
//        }
//    }

    public void vergelijkArrays() {
        int count = 1, tempCount;
        int popular = arrayList[0];
        int temp = 0;
        for (int i = 0; i < (arrayList.length - 1); i++) {
            temp = arrayList[i];
            tempCount = 0;
            for (int j = 1; j < arrayList.length; j++) {
                if (temp == arrayList[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println(popular);
    }

    public void muntenEnBriefjes() {
        int aantal = 0;
        int bedrag = Integer.parseInt(JOptionPane.showInputDialog("Geef Bedrag"));
        System.out.println("Voor het bedrag van: " + bedrag + "€ heb je de volgende munstukken of briefjes nodig:");
        for (int i = 4; i >= 0; i--) {
            aantal = bedrag / arrayList[i];
                //3 = 163         50
                //0 = 13          20
                bedrag = bedrag - (aantal * arrayList[i]);
                //13    =  163   - 3 * 50
                //0     =  13    - 0 * 20
                System.out.println(aantal + " briefjes/munten van € " + arrayList[i]);
            }
        }

    public int[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(int[] arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "Oefening1{" +
                "arrayList=" + Arrays.toString(arrayList) +
                '}';
    }
}

