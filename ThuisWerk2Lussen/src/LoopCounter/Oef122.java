package LoopCounter;

public class Oef122 {
    public static void main(String[] args) {
        int nummers = 0;
        for (int i = 1; i <= 500 ; i++) {

            //153 % 10 > 3
            //15 > 5

            int som = i / 10;
            if (som != 0) {
                nummers++;
                //System.out.println(som);
            } if (som != 0) {
                int overschot = i % 10;
                //System.out.println(overschot);
                System.out.println(Math.pow(overschot, nummers));
            }
        }
        //System.out.println(nummers);
    }
}
