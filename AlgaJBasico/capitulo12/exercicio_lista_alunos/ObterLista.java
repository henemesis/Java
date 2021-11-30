package exercicio_lista_alunos;

public class ObterLista {
    public static void obterListaAluno (ListaAlunos listaAlunos) {
        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Aluno alcunha = listaAlunos.obter(i);
            System.out.println("Aluno: " + alcunha.nome);
        }
    }
}
