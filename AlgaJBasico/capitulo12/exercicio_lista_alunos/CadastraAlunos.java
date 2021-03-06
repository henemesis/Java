package exercicio_lista_alunos;

public class CadastraAlunos {
    public static ListaAlunos listaDeAlunos = new ListaAlunos();

    public ListaAlunos adicionaAlunos() {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        listaDeAlunos.adicionar(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Lucas";
        listaDeAlunos.adicionar(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.nome = "José";
        listaDeAlunos.adicionar(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Jojo";
        listaDeAlunos.adicionar(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Jaja";
        listaDeAlunos.adicionar(aluno5);

        return listaDeAlunos;
    }

    public ListaAlunos retirar(ListaAlunos listaAlunos, int indiceObter) {
        Aluno alunoRemovido = listaAlunos.obter(indiceObter);
        listaAlunos.remover(alunoRemovido);
        adicionaAlunos();
        return listaAlunos;
    }

    public ListaAlunos organizaAluno(ListaAlunos listaAlunos) {
//        ListaAlunos listaDeAlunos = new ListaAlunos();
        adicionaAlunos();
        listaAlunos.ordenar();
        return listaAlunos;
    }
}
