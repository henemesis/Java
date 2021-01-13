package com.javaBasico;

import java.util.Arrays;

public class Exercicio_01_d {

    public static void main(String[] args) {
        int[] sequencia = new int[10];

        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = (int) (Math.pow(i, 2)) + 3;

        }
        System.out.print(Arrays.toString(sequencia));
    }

}

