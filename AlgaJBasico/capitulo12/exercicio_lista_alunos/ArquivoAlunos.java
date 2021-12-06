package exercicio_lista_alunos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArquivoAlunos {

    public void adicionarLista() throws IOException {

//        Arquivos responsáveis por gerar os arquivos para cadastro!

        CadastraAlunos alunosAdicionados = new CadastraAlunos();
        FileOutputStream file = new FileOutputStream("/tmp/aula/arquivo.txt");
        ObjectOutputStream obj = new ObjectOutputStream(file);

        ListaAlunos lista = alunosAdicionados.organizaAluno(alunosAdicionados.adicionaAlunos());

        obj.writeObject(lista.toString());
        obj.flush();
        obj.close();
    }
}

