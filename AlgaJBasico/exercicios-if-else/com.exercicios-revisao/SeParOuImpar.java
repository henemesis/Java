import java.util.Scanner;

public class SeParOuImpar {

    public static void main(String[] args) {
        System.out.println("SE PAR SOMA 5, SE ÍMPAR SOMA 8");
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.print("Digite qualquer número inteiro: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse numero é par e somado a 5" +
                    " terá como resultado: " + (numero + 5));
        } else {
            System.out.println("Esse numero é ímpar e somado a 8" +
                    " terá como resultado: " + (numero + 8));
        }
        scanner.close();
    }
}
