import java.util.Scanner;

public class DobroOuTriplo {

    public static void main(String[] args) {
        System.out.println("SERÁ O DOBRO OU SERÁ O TRIPLO?");
        Scanner scanner = new Scanner(System.in);
        int numeroInteiro = 0;

        System.out.print("Digite um número (positivo ou negativo): ");
        numeroInteiro = scanner.nextInt();

        if (numeroInteiro >= 0) {
            System.out.println("O número digitado é positivo e seu dobro será: " + (numeroInteiro * 2));
        } else {
            System.out.println("O número digitado é negativo e seu triplo será: " + (numeroInteiro * 3));
        }
        scanner.close();
    }
}
