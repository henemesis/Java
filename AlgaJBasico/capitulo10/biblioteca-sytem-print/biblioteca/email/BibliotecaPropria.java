package biblioteca.email;

import console.Interacao;

public class BibliotecaPropria {

    public static void main(String[] args) {

        Interacao interacao = new Interacao();

        Integer numero = interacao.lerNumero("Digite um número: ");
        System.out.println("Número: " + numero);

        Double decimal = interacao.lerDecimal("Digite um decimal: ");
        System.out.println("Decimal: " + decimal);

        interacao.erro("Essa é uma msg de erro!");

        interacao.fechar();

    }
}
