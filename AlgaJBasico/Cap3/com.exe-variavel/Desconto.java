import java.util.Scanner;

public class Desconto {

    public static void main(String[] args) {

        final Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = entrada.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        Integer qtdProduto = entrada.nextInt();

        Double subtotal = valorProduto * qtdProduto;

        System.out.print("Valor total é de: " + subtotal);


        if (qtdProduto > 10) {
            System.out.println("\nQuantidade de produto habilitada para desconto");
            Double novoValor = subtotal * (0.9);

            System.out.println("O valor final é de: " + novoValor);
        }


    }
}
