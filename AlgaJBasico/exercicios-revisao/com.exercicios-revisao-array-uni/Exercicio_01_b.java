package com.javaBasico;

import java.util.Arrays;

public class Exercicio_01_b {

    public static void main(String[] args) {

        int[] vetorImpar = new int[11];

        for (int i = 0; i < vetorImpar.length; i++){
            vetorImpar[i] = (int) Math.pow(i, 2);
        }
        System.out.println(Arrays.toString(vetorImpar));
    }
}
