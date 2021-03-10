package com.javaBasico;

public class Exercicio_01_c {

    public static void main(String[] args) {
        int[] valor = new int[10];
        int contador = 1;
        for (int i = 0; i < valor.length; i++ ) {
            if (i < 5) {
                valor[i] = i + 1;
            } else if (contador <= 5){
                valor[i] = contador * 10;
                contador++;
            }
            System.out.println(valor[i]);
        }
    }
}
