package exercicio_lista_alunos;

public class Principal {

    public static void main(String[] args) {

        CadastraAlunos cadastraAlunos = new CadastraAlunos();

/*      Chamando lista aluno*/
        ObterLista.obterListaAluno(cadastraAlunos.cadastrarAlunos());
        System.out.println("====================================================");

        System.out.println("Remoção");
        ObterLista.obterListaAluno(cadastraAlunos.retirar(cadastraAlunos.cadastrarAlunos(), 3));
        System.out.println("====================================================");

        System.out.println("Remoção");
        ObterLista.obterListaAluno(cadastraAlunos.retirar(cadastraAlunos.cadastrarAlunos(), 0));

        System.out.println("====================================================");
        System.out.println("Ordenamento");
        ObterLista.obterListaAluno(cadastraAlunos.organizaAluno(cadastraAlunos.cadastrarAlunos()));
    }
}
