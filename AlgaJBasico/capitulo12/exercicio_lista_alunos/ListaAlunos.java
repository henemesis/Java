package com.capitulo12.exercicio_lista_alunos;

public class ListaAlunos {

//    Quantidade de alunos para inicializar a lista
    final static int QUANTIDADE_LISTA = 2;

//    Criando variável para determinar o tamanho da Lista
    int tamanhoDaLista = 0;

//    Método para tamanho de lista
    public int tamanho() {
        return tamanhoDaLista;
    }

//    Array de alunos já inicializado com QUANTIDADE_LISTA
    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

//    Criando um método para obter alunos de acordo com o indice
    public Aluno obter(int indice) {
        return lista[indice];
    }

/*    Criando método para obter alunos (Você vai adicionar quem? --> Alunos (Ou seja,
*       aluno será o paramêtro deste método)    */

    public void adicionar (Aluno aluno) {
        if (lista.length == tamanhoDaLista) {
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for(int i = 0; i < lista.length; i++) {
                novaLista[i] = lista[i];
            }
            lista = novaLista;
        }
        lista[tamanhoDaLista] = aluno;
        tamanhoDaLista++;
    }

/*      Criando os parâmetro para remoção. Aqui estou varrendo o vetor para encontrar
*           a posição a qual será retirada (substituída)    */
    public void remover (Aluno aluno) {
        for(int i = 0; i < tamanhoDaLista; i++) {
/*      tamanhoDaLista é iterado pois, não estou varrendo toda a Lista e sim o TOTAL de
*           elementos adicionados   */
            Aluno a = lista[i];

/*      Neste caso, para evitar NullPointerException devemos fazer a comparação com Null e depois
*           validar o equals. veja*/
            if (aluno != null && a.equals(aluno)) {
                remover(i);
                break;
            }
        }
    }

/*      "Removendo" uma posição do Array, ou seja, passando um elemento para frente e es-
*           condendo o outro UTILIZANDO SOBRESCRITA!   */
    public void remover(int indice) {

        int indiceInicial = indice + 1;
/*      "Pulando" uma posição a diante! */

        for(int i = indiceInicial; i < tamanhoDaLista; i++) {
            lista[i - 1] = lista[i];
        }
        tamanhoDaLista--;
        lista[tamanhoDaLista] = null;
    }
}
