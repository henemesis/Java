import java.util.Scanner;

public class ExercicioDescFrete {

//    Variável estática, valor imutável dentro do programa.
   static final Double VALOR_FRETE = 15.0;

    public static void main(String[] args) {

        System.out.println("CARRINHO DE COMPRAS! ");
        System.out.println("COMPRAS ACIMA DE 100 REAIS NÃO PAGAM FRETE! (FRETE: R$15,00) ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valor = scanner.nextDouble();

        Boolean precisaCobrarFrete = valor < 100;

        if (precisaCobrarFrete){
            System.out.println("Valor do Produto: " + (valor += 15.0));
        } else {
            System.out.println("Valor do Produto (Parabéns você ganhou um desconto no frete): " + valor);
        }



    }
}
