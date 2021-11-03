package com.capitulo10.leituraDeArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeArquivos {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("/tmp/aula/arq.txt");

        int contador = 1;
        List<String> linhas = Files.readAllLines(arquivo);

        for (int i = 0; i < linhas.size(); i++) {
            String nome = linhas.get(i);

            System.out.println("Jogador " + contador + ": " + nome);
            contador++;
        }


    }
}
