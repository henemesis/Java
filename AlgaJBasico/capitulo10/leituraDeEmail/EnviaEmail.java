package leituraDeEmail;

import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EnviaEmail {

    public static void main(String[] args) throws IOException, EmailException {
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

        String listaTarefas = "";
        for (int iteracao = 0; iteracao < linhas.size() ; iteracao++) {
            listaTarefas += linhas.get(iteracao) + "\n";
        }

        String mensagem = "Suas tarefas: \n" + listaTarefas;

        System.out.println("Digite seu e-mail: ");
        String enviarPara = scanner.next();

        Correio.enviar(enviarPara, "Segue a lista de assuntos", mensagem);

        scanner.close();
        System.out.println("Fim né?!?!");
    }

}

