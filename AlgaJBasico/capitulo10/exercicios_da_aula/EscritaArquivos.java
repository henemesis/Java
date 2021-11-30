package com.capitulo10.exercicios_da_aula;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String tarefas, parada;
        ArrayList<String> linhas = new ArrayList<>();
        int contador = 1;
        boolean confimacao = true;

        while (confimacao) {
            System.out.print("Digite a " + contador + "ª tarefa a ser realizada: ");
            tarefas = scanner.nextLine();
            linhas.add(tarefas);

            System.out.print("Caso deseje parar, digite sim, caso não, tecle enter novamente: ");
            parada = scanner.nextLine();
            System.out.println();
            if (parada.equalsIgnoreCase("x")) {
                confimacao = false;
            }
            contador += 1;
        }
        escritaNoArquivo("/tmp/aula/arquivo.txt", linhas);
        scanner.close();
        System.out.println("Fim né?!?!");
    }

    static void escritaNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
        Path caminho = Paths.get(arquivo);
        Files.write(caminho, linhas);
    }
}