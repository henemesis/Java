package com.capitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RelembrandoAula {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        ArrayList<String> linhas = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Jogador " + contador + ": ");
            String nome = scanner.nextLine();

            linhas.add(nome);
            contador += 1;
        }

        Path arquivo = Paths.get("/tmp/aula/arquivo.txt");
        Files.write(arquivo, linhas);

        scanner.close();
        System.out.println("Fim...");
    }
}