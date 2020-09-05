import java.util.Scanner;

public class PalindromoWhile {

//    EXECUÇÃO LÓGICA DO APP
    public static String logicaFuncional(String palavra) {

        int tamanho = palavra.length();
        int i = tamanho - 1;
        String troca = "";
        while (i >= 0) {
            troca += palavra.charAt(i);
            i--;
        }
        System.out.println(troca);
        String msg = palavra.equals(troca) ? "A palavra  " + palavra + " é um palíndromo!" : "A palavra  " + palavra + " não é um palíndromo!";
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);

        return null;
    }


    public static void main(String[] args) {
//        INICIALIZAÇÃO DO APP
        System.out.println("SISTEMA DE CHECAGEM DE PALÍNDROMOS");

//        STRING RESPONSÁVEL POR CHECAR A CONTINUIDADE DA EXECUÇÃO
        String check = "";

//        VERIFICAÇÃO DA PALAVRA DO USUÁRIO
        do {
            String palavra = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma palavra: ");
            palavra = scanner.nextLine();
            logicaFuncional(palavra);

//            CONFIRMAÇÃO DE CONTINUIDADE DA EXECUÇÃO DO APP
            System.out.println("Deseja continuar? ");
            check = scanner.nextLine();

            if (check.equalsIgnoreCase("n")) {
                scanner.close();
            }
        } while (!check.equalsIgnoreCase("n"));

//        FINALIZAÇÃO DO SERVIÇO
        System.out.println("App finalizado com sucesso!");
        StringBuilder frase = new StringBuilder("omo");
        System.out.println(frase.reverse().toString().equals(frase.toString()));
    }
}
