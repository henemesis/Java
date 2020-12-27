import java.util.Scanner;

public class SeSomaMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int soma;
        System.out.println("SOMA -- Favor digitar os números");

        System.out.print("Digite o número que representará a letra A: ");
        a = scanner.nextInt();

        System.out.print("Digite o número que representará a letra B: ");
        b = scanner.nextInt();

        System.out.print("Digite o número que representará a letra C: ");
        c = scanner.nextInt();

        soma = a + b;

        if (soma < c) {
            System.out.println("Sua soma é menor que o valor digitado em c. \nValor " +
                    "em c = " + c + "\nValor da soma = " + soma);
        }

        scanner.close();
    }
}
