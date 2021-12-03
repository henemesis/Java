package exercicio_lista_alunos;

public class ObterLista {
    public static void obterListaAluno(ListaAlunos listaAlunos) {
        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Aluno alcunha = listaAlunos.obter(i);
            if (alcunha != null) {
                System.out.println("Aluno: " + alcunha.nome);
            }  else {
                System.out.println("Aluno sem nome");
            }
        }
    }
}
