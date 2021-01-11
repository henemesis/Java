import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        System.out.println("Calculando IMC Adulto");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        if (IMC < 18.5) {
            System.out.println("Peso abaixo do \"Normal\" ");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso \"Normal\" ");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Acima do peso!");
        } else {
            System.out.println("Obeso!");
        }

        scanner.close();
    }
}
