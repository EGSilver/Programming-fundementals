package LoopCounter;

import javax.swing.*;

public class Oef9 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibonacci " + "7" + " numbers:");
        for (int i = 1; i <= 7; i++) {
            System.out.print(num1 + " ");
            int vorigeSom = num1 + num2;
            num1 = num2;
            num2 = vorigeSom;
        }
    }
}
