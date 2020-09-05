import java.util.Scanner;

public class Palindromo {

    public static String palindromo(String palavra) {
        int tamanho = palavra.length();
        String troca = "";
        for (int i = tamanho -1; i >= 0  ; i--) {
            troca += palavra.charAt(i);
        }
        System.out.println(troca);

        if (palavra.equals(troca)){
            System.out.println("A palavra " + palavra + " é um Palíndromo");
        } else {
            System.out.println("Errado a palavra " + palavra + " não é um Palíndromo");
        }

        return null;
    }

    public static void main(String[] args) {
        String entrada = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        entrada = in.nextLine();
        palindromo(entrada);
    }
}
