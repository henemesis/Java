package exercicio_lista_alunos;

import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {

        CadastraAlunos cadastraAlunos = new CadastraAlunos();
        ArquivoAlunos arquivo = new ArquivoAlunos();

/*      Chamando lista aluno*/
        ObterLista.obterListaAluno(cadastraAlunos.adicionaAlunos());
        System.out.println("====================================================");

        System.out.println("Remoção");
        ObterLista.obterListaAluno(cadastraAlunos.retirar(cadastraAlunos.adicionaAlunos(), 3));
        System.out.println("====================================================");

        System.out.println("Remoção");
        ObterLista.obterListaAluno(cadastraAlunos.retirar(cadastraAlunos.adicionaAlunos(), 0));

        System.out.println("====================================================");
        System.out.println("Ordenamento");
        ObterLista.obterListaAluno(cadastraAlunos.organizaAluno(cadastraAlunos.adicionaAlunos()));

        System.out.println("====================================================");
        arquivo.adicionarLista();
    }
}
