package com.javaBasico;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] d = new double[10];

        for (int i = 0; i < d.length ; i++) {
            System.out.print("Digite o " + (i +1) + "º valor: ");
            d[i] = scanner.nextDouble();
        }
        System.out.println("Valores digitados: " + Arrays.toString(d));
    }
}
