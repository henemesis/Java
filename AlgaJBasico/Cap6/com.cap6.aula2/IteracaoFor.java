import java.lang.reflect.Array;
import java.util.Arrays;

public class IteracaoFor {

    public static void main(String[] args) {


     for (int i = 0; i < 5; i++ ) {
         System.out.println("veja");
     }
        int [] i = new int[5];
        int posicao = 0;
        for (int veja:
                i) {
            System.out.println(i[veja] = posicao++);
        }
        // checando a posição do array a cada volta do foreach!

        Integer [] produtos = new Integer[]{100, 225, 300};

        for (int k = 0; k < produtos.length; k++) {
            Integer produto = produtos[k];
            System.out.println(produto);

            if (produto.equals(225)){
                System.out.println("Produto encontrado: " + produtos[k]);
                break;
            }
        }

//        Demonstração do for acima com o uso do enhanced for
        for (Integer produto: produtos
             ) {
            System.out.println(produto);
            if (produto.equals(225)) {
                System.out.println("Produto encontrado: " + produto);
                break;
            }
        }


    }
}
