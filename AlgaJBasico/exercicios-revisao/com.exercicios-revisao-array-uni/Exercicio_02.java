package com.javaBasico;

import java.util.Arrays;

public class Exercicio_02 {

    public static void main(String[] args) {
        double [] a = new double[6];
        for (int i = 0; i < a.length ; i++) {
            a[i] += i;

        }
        System.out.print("O vetor de 6 posições terá os seguintes valores: " + Arrays.toString(a));
    }
}
