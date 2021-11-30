package com.capitulo12.src;

public class AlgoritmoAvancado {

    public static void main(String[] args) {
        ListaAlunos listaAlunos = new ListaAlunos();

        Aluno aluno = new Aluno();
        aluno.nome = "João";
        listaAlunos.adicionar(aluno);

        aluno = new Aluno();
        aluno.nome = "Maria";
        listaAlunos.adicionar(aluno);

        aluno = new Aluno();
        aluno.nome = "Alexandre";
        listaAlunos.adicionar(aluno);

        aluno = new Aluno();
        aluno.nome = "Normandes";
        listaAlunos.adicionar(aluno);

        aluno = new Aluno();
        aluno.nome = "Thiago";
        listaAlunos.adicionar(aluno);

        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Aluno a = listaAlunos.obter(i);
            System.out.println("Aluno: " + a.nome);

        }

    }
}
