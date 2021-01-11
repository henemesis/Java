import java.util.Scanner;

public class CalculandoDesconto {

    public static void main(String[] args) {

        System.out.println("CALCULANDO O VALOR DA MERCADORIA");

        System.out.println("Preço da mercadoria: R$30,00");
        double valorMercadoria = 30.00;

        System.out.println("Formas de Pagamento" +
                "\n1) à vista em espécie ou cheque, com desconto de 10 %; " +
                "\n2) à vista no cartão de crédito, com 15% de desconto; " +
                "\n3) Em duas vezes sem juros; " +
                "\n4) Em três vezes com juros de 10%");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite a forma de pagamento: ");
        double pagamento = scanner.nextDouble();
        double total = 0.0;

        if (pagamento == 1){
            total = valorMercadoria * 0.9;
            System.out.println("O valor com desconto de 10% é de R$" + total);
        } else if (pagamento == 2) {
            total = valorMercadoria * 0.85;
            System.out.println("O valor com desconto de 15% é de R$" + total);
        } else if (pagamento == 3){
            System.out.println("O valor de etiqueta R$" + valorMercadoria);
        } else {
            total = valorMercadoria * 1.10;
            System.out.println("O valor total em 3 vezes com 10% de juros é de R$: " + total);
        }

        scanner.close();
    }
}
