import java.util.Scanner;

public class AlterandoValorVariavel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo de pagamento [1 = à vista /  2 a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoPagamento.equals(1) ;
        Double valorTotal = 0.0;
        String msg = new String("");
        msg = pagamentoAVista ? "pagamento a vista no valor de: R$" + (valorProduto) : "O pagamento foi a prazo, no valor de: " + (valorTotal = valorProduto * 1.1);

        System.out.println(msg);
    }
}
