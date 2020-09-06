import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        System.out.println("BEM VINDO AO CALC SIMPLES!");
        String continua = null;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Favor digitar um número: ");
            Double primeiro_numero = scanner.nextDouble();

            System.out.print("Favor digitar a operação: ");
            String operacao = scanner.next();

            System.out.print("Favor digitar outro número: ");
            Double segundo_numero = scanner.nextDouble();

            Double resultado = 0.0;
            String nomeOperacao = null;

            if (operacao.equals("+")) {
                resultado = primeiro_numero + segundo_numero;
                nomeOperacao = "soma";
            } else if (operacao.equals("-")) {
                resultado = primeiro_numero - segundo_numero;
                nomeOperacao = "subtração";
            } else if (operacao.equals("*")) {
                resultado = primeiro_numero * segundo_numero;
                nomeOperacao = "multiplicação";
            } else if (operacao.equals("/")) {
                resultado = primeiro_numero / segundo_numero;
                nomeOperacao = "divisão";
            }

            System.out.println( "O valor da " + nomeOperacao + "é: " + resultado);

            System.out.print("DESEJA CONTINUAR? (S/N): ");
            continua = scanner.next();

            if (!continua.equalsIgnoreCase("S")){
                scanner.close();
            }

        } while (continua.equalsIgnoreCase("S"));
    }
}
