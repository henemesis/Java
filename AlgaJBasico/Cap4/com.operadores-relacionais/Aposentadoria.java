import java.util.Scanner;

public class Aposentadoria {

    public static void main(String[] args) {
        System.out.println("VERIFICAÇÃO PARA A APOSENTADORIA");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Favor digitar a idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        Integer tempoContribuicao = scanner.nextInt();

        if (idade >= 55 && tempoContribuicao >= 25){
            System.out.println("Você está apto a aposentar");
        } else {
            System.out.println("Condições insuficientes para aposentadoria!");
        }
    }
}
