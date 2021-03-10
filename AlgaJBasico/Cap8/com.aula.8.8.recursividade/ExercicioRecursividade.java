import java.util.Scanner;

public class ExercicioRecursividade {

    public static void main(String[] args) {

        System.out.println("IMPRIMINDO TÁBUADA \n");

        System.out.print("Favor, informar número: ");
        Scanner scanner = new Scanner(System.in);

        Integer valorDigitado = scanner.nextInt();

        imprimirTabuada(valorDigitado, 0);

        scanner.close();

    }

    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));

        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }

    }
}
