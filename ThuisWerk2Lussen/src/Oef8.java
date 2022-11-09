import javax.swing.*;

//public class Oef8 {
//    public static void main(String[] args) {
//        //Bereken de faculteit van een getal.
//        //De faculteit van een getal is het getal vermenigvuldigd met alle getallen kleiner dan zichzelf,
//        //uitgezonderd 0.
//        //De faculteit van 4, nl 4! = 4*3*2*1 = 24
//        int thirdSum =0;
//        int secondSum = 0;
//        int firstSom = 0;
//        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
//        int getalmin = getal;
//        for (int i = 0; i < 5; i++) {
//            getalmin--;
//            firstSom = getal * getalmin;
//            secondSum = firstSom * getalmin;
//            thirdSum = secondSum * getalmin;
//        }
//        System.out.println(firstSom + " " + secondSum + " " + thirdSum);
//    }
//}

public class Oef8 {
    public static void main(String[] args) {
        int getal = Integer.parseInt(JOptionPane.showInputDialog("Geef Waarde"));
        int fac = getal;
        System.out.print(fac);
        for (int i = fac-1; i > 0; i--) {
            fac = fac * i;
            System.out.print("*"+i);
        }
        System.out.println("="+fac);
    }
}
