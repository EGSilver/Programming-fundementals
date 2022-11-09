package LoopCounter;

import javax.swing.*;
public class Oef12 {
    public static void main(String[] args) {

        int laagGetal = 1;
        int hoogGetal = 500;

        for(int i = laagGetal + 1; i < hoogGetal; ++i) {
            int digits = 0;
            int result = 0;

            // number of digits calculation
            while (i != 0) {
                i /= 10;
                ++digits;
            }

            i = i;

            // result contains sum of nth power of its digits
            while (i != 0) {
                int remainder = i % 10;
                result += Math.pow(remainder, digits);
                i /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }
        }
    }
}