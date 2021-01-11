import java.util.Scanner;

public class VerdadeiroOuFalso {

    public static void main(String[] args) {

        System.out.println("VERDADEIRO OU FALSO?");
        Scanner scanner = new Scanner(System.in);
        boolean primeiroValor;
        boolean segundoValor;

        System.out.print("Digite o primeiro valor lógico (true ou false): ");
        primeiroValor = scanner.nextBoolean();
        System.out.print("Digite o segundo valor lógico (true ou false): ");
        segundoValor = scanner.nextBoolean();

        if (primeiroValor && segundoValor) {
            System.out.println("Ambos são verdadeiros (true and true)");
        } else if (!primeiroValor && !segundoValor) {
            System.out.println("Ambos são falsos (false and false)");
        } else {
            System.out.println("Um dos valores lógicos será falso " +
                    " (true and false) ou (false and true)");
        }

//        if (primeiroValor == segundoValor) {
//            if (primeiroValor) {
//                System.out.println("Ambos são verdadeiros (true and true)");
//            } else {
//                System.out.println("Ambos são falsos (false and false)");
//            }
//        } else {
//            System.out.println("Um dos valores lógicos será FALSO, enquanto o outro será VERDADEIRO");
//        }
        scanner.close();
    }
}
